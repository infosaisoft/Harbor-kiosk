package com.harbor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.harbor.dto.DepartmentDto;
import com.harbor.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService dptService;
	
	
	@RequestMapping(value="adddepartment" ,method=RequestMethod.POST,consumes= {"application/JSON", "application/XML"})
	public @ResponseBody String registratinDepartment(@RequestBody DepartmentDto dptdto ,@Context HttpServletRequest req) {
		String result=null;
		//use service
		String m[]=dptdto.getDptName();
		String n[]=dptdto.getDptLocation();
		for(int i=0;i<m.length;i++)
		{
		System.out.println("dept name====>"+m[i]);
		System.out.println("dept location====>"+n[i]);
		}
		result=dptService.registration(dptdto);
		
		return result;
	}

}
