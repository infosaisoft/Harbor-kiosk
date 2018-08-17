package com.harbor.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.PatientDiseasesDto;
import com.harbor.dto.PatientDto;
import com.harbor.service.Doctor_HospitalService;

@RestController
public class Doctor_HospitalController {
	
	@Autowired
	Doctor_HospitalService docservice=null;
	
	@RequestMapping(value="/getalldoctro",method=RequestMethod.GET)
	public @ResponseBody  List<Doctor_HospitalDto> viewAllDoctor(){
		List<Doctor_HospitalDto>listdto=null;
		
		listdto=docservice.getallData();
		
		return listdto;
	}
	
	@RequestMapping(value="/getdiseases",method=RequestMethod.GET)
	public @ResponseBody PatientDiseasesDto viewDisease(@RequestParam("pid") String pid){
	
		System.out.println("pid::"+pid);
		PatientDiseasesDto dto=null;
		dto=docservice.getPatientdisease(pid);
		return dto;
	}

}
