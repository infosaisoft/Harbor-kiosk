package com.harbor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.dto.AdminDto;
import com.harbor.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	
	@RequestMapping(value="/registeradmin",method=RequestMethod.POST,consumes={"application/JSON", "application/XML"})
	public @ResponseBody String registrationAdmin(@RequestBody AdminDto adto) {
		String result=null;
		//use service
		result=adminservice.registration(adto);
		
		return result;
	}

}
