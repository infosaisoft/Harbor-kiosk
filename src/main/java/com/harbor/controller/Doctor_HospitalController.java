package com.harbor.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.command.DoctorHospitalCommand;
import com.harbor.command.HospitalCommand;
import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.HospitalDiseasesDto;
import com.harbor.dto.HosptialDto;
import com.harbor.dto.PatientDiseasesDto;
import com.harbor.dto.PatientDto;
import com.harbor.service.Doctor_HospitalService;

@Controller
public class Doctor_HospitalController {

	@Autowired
	Doctor_HospitalService docservice = null;

	HttpSession ses = null;

	@RequestMapping(value = "/getalldisease", method = RequestMethod.GET)
	public String viewAllDoctor(Map<String, Object> map, HttpServletRequest req) {
		
		long id = 0;
		List<HospitalDiseasesDto>listdto=null;
		ses = req.getSession();
		id=(long) ses.getAttribute("id");
		//USE SERVICE
		listdto=docservice.getPatientdisease(id); 
		
		map.put("listdto", listdto);
		return "disease";
	}

	
	@RequestMapping(value = "/gethospital", method = RequestMethod.GET)
	public String viewHospital(Map<String, Object> map,HttpServletRequest req,HospitalCommand hoscmd) {
		HosptialDto hdto = null;
		List<Doctor_HospitalDto> listdto = null;
		long id=0;
		
		  ses=req.getSession();
		  id=(long) ses.getAttribute("id");
		  
		  //use service
		hdto = docservice.getHospitalInfo(id);
		listdto = docservice.getallData(id);
		
		
		BeanUtils.copyProperties(hdto, hoscmd);
		map.put("hoscmd", hoscmd);
		map.put("listdto", listdto);
		return "hospital_profile";
	}
}
