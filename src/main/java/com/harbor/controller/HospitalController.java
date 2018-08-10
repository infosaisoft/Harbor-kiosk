package com.harbor.controller;

import javax.imageio.spi.RegisterableService;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.dto.HosptialDto;
import com.harbor.service.RegistrationHospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private RegistrationHospitalService service=null;
	
	
	@RequestMapping(value="/regisration",method=RequestMethod.POST,consumes={"application/JSON", "application/XML"})
	public @ResponseBody String hospitalRegistation(@RequestBody HosptialDto hdto) {
		String result=null;
		
		//use service
		result=service.registation(hdto);
		return result;
	}
	
	

}
