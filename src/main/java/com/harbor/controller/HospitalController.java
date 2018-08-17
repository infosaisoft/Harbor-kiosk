package com.harbor.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.harbor.dto.HosptialDto;
import com.harbor.service.RegistrationHospitalService;

@RestController
@CrossOrigin("*")
public class HospitalController {

	@Autowired
	private RegistrationHospitalService service = null;

	@Consumes(MediaType.APPLICATION_JSON)
	@CrossOrigin("*")
	@RequestMapping(value = "/register-hospital", method = RequestMethod.POST, consumes = { "application/JSON",
			"application/XML" })
	public @ResponseBody String hospitalRegistation(@RequestBody HosptialDto hdto) {
		String result = null;
		MultipartFile logo = null;
		String fname = null;
		OutputStream os = null;
		InputStream is = null;
		logo = hdto.getHospitalLogo();

		// get file name
		fname = logo.getOriginalFilename();

		try {
			// create OutputStreams pointing to dest files on server machine file system
			os = new FileOutputStream("e:\\upload\\" + fname);

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
		// use service
		result = service.registation(hdto);
		return result;
	}

}
