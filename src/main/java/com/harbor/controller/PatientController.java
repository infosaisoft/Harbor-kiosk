package com.harbor.controller;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.junit.runner.RunWith;
import org.mockito.internal.util.io.IOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harbor.dto.PatientDto;
import com.harbor.service.PatientService;


@RestController
@RequestMapping("/patient")
public class PatientController {
		
	@Autowired
	PatientService PatSer;
	
	
	
	@Consumes(MediaType.APPLICATION_JSON)
	@RequestMapping(value="/patient_add", method =RequestMethod.POST,consumes={"application/JSON", "application/XML"})
	public @ResponseBody String insertPatient( @RequestBody PatientDto PatDto,HttpServletRequest req) {
		String result = null;
		System.out.println(PatDto);
		PatDto.setPatientName("rtsf");
		String json=req.getContentType();
		System.out.println(json);
		result = PatSer.registerPatient(PatDto);
		return result;
		
		
	}
	
}