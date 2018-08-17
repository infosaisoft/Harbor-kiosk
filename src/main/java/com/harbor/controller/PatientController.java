package com.harbor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.dto.PatientDto;
import com.harbor.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	 PatientService pservice=null;
	
	@RequestMapping(value="/registerpatient",method=RequestMethod.POST,consumes={"application/JSON", "application/XML"})
	public @ResponseBody String registration(@RequestBody PatientDto pdto) {
		String result=null;
		
		result=pservice.registerPatient(pdto);
		return  result;
	}

}
