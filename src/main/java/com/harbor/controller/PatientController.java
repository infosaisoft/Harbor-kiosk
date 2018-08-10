package com.harbor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.harbor.dto.PatientDto;
import com.harbor.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService PatSer;

	@Consumes(MediaType.APPLICATION_JSON)
	@CrossOrigin("*")
	@RequestMapping(value = "/patient_add", method = RequestMethod.POST, consumes = { "application/JSON",
			"application/XML" })
	public @ResponseBody String insertPatient(@RequestBody PatientDto PatDto, HttpServletRequest req,
			HttpServletResponse res) {
		String result = null;
		System.out.println(PatDto);
		PatDto.setPatientName("rtsf");
		res.setContentType("Access-Control-Allow-Headers");
		result = PatSer.registerPatient(PatDto);
		return result;

	}

}
