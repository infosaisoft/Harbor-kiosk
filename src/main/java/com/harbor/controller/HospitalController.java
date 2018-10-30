package com.harbor.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.harbor.command.HospitalCommand;
import com.harbor.common.CustomIdGenrater;

import com.harbor.dto.HosptialDto;
import com.harbor.service.RegistrationHospitalService;

@Controller
public class HospitalController {

	@Autowired
	private RegistrationHospitalService service;

	HttpSession ses = null;

	@RequestMapping(value = "/register-hospital", method = RequestMethod.GET)
	public String hospitalRegistationHome(@ModelAttribute("register-hospital") HospitalCommand hcmd) {

		return "register-hospital";
	}

	@RequestMapping(value = "/register-hospital", method = RequestMethod.POST)
	public String hospitalRegistation(Map<String, Object> map,@Valid @ModelAttribute("register-hospital") HospitalCommand hcmd,BindingResult error, HttpServletRequest req,RedirectAttributes redirectattribute) {
		String result = null;
		MultipartFile logo = null;
		String fname = null;
		OutputStream os = null;
		InputStream is = null;
		String fullname = null;
		long id = 0;

		ses = req.getSession();
		
		
		
		if (error.hasErrors()) {
			 redirectattribute.addFlashAttribute("name", error);
			return "register-hospital";
		}

		logo = hcmd.getLogo_photo();
		




		// get file name
		fname = logo.getOriginalFilename();

		try {

			String extenstion = FilenameUtils.getExtension(fname);
			fullname = String.valueOf(CustomIdGenrater.getID());

			fullname = "img-" + fullname + "." + extenstion;

			File imageFile = new File(req.getServletContext().getRealPath("/assets/images/hospital/"), fullname);
			// create OutputStreams pointing to dest files on server machine file system
			os = new FileOutputStream(imageFile);

			// create InputStream representing uploaded files
			is = logo.getInputStream();

			// perform file copy operation to complete FileUploading
			IOUtils.copy(is, os);
		}

		catch (IOException io) {
			io.printStackTrace();

		}

		catch (Exception e) {
			e.printStackTrace();

		}

		finally {

			// close all stream
			try {
				if (os != null) {
					os.close();
				}
			}

			catch (IOException io) {
				io.printStackTrace();
			}

			try {
				if (is != null) {
					is.close();
				}
			}

			catch (IOException io) {
				io.printStackTrace();
			}
		}

		// copy cmd to dto

		System.out.println("the error is:::" + error);
		

		HosptialDto hdto = new HosptialDto();
		BeanUtils.copyProperties(hcmd, hdto);
		hdto.setLogo(fullname);

		// use service

		result = service.registation(hdto);

		map.put("result", result);

		id = hdto.getId();

		System.out.println("hospitalid::" + id);
		ses.setAttribute("id", id);
		map.put("id", id);
		return "redirect:/admin";
	}

}
