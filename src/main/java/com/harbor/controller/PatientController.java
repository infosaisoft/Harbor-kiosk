package com.harbor.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.harbor.command.PatientCommand;
import com.harbor.dto.PatientDto;
import com.harbor.service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	 PatientService pservice=null;
	
	
	@RequestMapping(value="/patient",method=RequestMethod.GET)
	public String patientForm(@ModelAttribute("patient")PatientCommand patient) {
		
		return "patient";
	}
	
	@RequestMapping(value="/patient",method=RequestMethod.POST)
	public  String registration(Map<String,Object>map, @ModelAttribute("patient")PatientCommand patient) {
		String result=null;
		PatientDto pdto=null;
		//copy cmd to dto
		pdto=new PatientDto();
		BeanUtils.copyProperties(patient, pdto);
		result=pservice.registerPatient(pdto);
		map.put("result", result);
		return  "patient";
	}

}
