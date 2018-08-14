package com.harbor.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

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
	private RegistrationHospitalService service=null;
	
	@Consumes(MediaType.APPLICATION_JSON)
	@CrossOrigin("*")
	@RequestMapping(value="/register-hospital",method=RequestMethod.POST,consumes={"application/JSON", "application/XML"})
	public @ResponseBody String hospitalRegistation(@RequestBody HosptialDto hdto) {
		String result=null;
		MultipartFile logo=null;
		String fname=null;
	        logo=hdto.getHospitalLogo();
	        
	        //get file name
	        fname=logo.getOriginalFilename();
		//use service
		result=service.registation(hdto);
		return result;
	}
	
}
