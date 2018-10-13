package com.harbor.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.harbor.command.DepartmentCommand;
import com.harbor.dto.DepartmentDto;
import com.harbor.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService dptService;
	
	
	
	@RequestMapping(value="department",method=RequestMethod.GET)
	public String DepartmentPage(@ModelAttribute("department") DepartmentCommand department) {
		return "department";
	}
	
	
	@RequestMapping(value="department" ,method=RequestMethod.POST)
	public  String registratinDepartment(Map<String, Object>map,@ModelAttribute("department")DepartmentCommand department ,@Context HttpServletRequest req) {
		String result=null;
		DepartmentDto deptdto=null; 
		
		//copy cmd to bo
		deptdto=new DepartmentDto();
		BeanUtils.copyProperties(department, deptdto);
		//use service
		String m[]=deptdto.getDptName();
		String n[]=deptdto.getDptLocation();
		for(int i=0;i<m.length;i++)
		{
		System.out.println("dept name====>"+m[i]);
		System.out.println("dept location====>"+n[i]);
		}
		result=dptService.registration(deptdto);
		map.put("result", result);
		return "department";
	}
	
	
	@ModelAttribute("deptname")
	public Map<String,Object> departmentName(){
		Map<String,Object>deptname=new HashMap<>();
		
		deptname.put("OPD", "OPD");
		deptname.put("genral", "genral");
		return deptname;
	}
	
	
	@ModelAttribute("deptlocation")
	public Map<String,Object> departmentLocation(){
		Map<String,Object>deptlocation=new HashMap<>();
		
		deptlocation.put("First", "First");
		deptlocation.put("Second", "Second");
		return deptlocation;
	}
 
}
