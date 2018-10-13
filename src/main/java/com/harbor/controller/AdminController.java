package com.harbor.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harbor.command.AdminCommand;
import com.harbor.dto.AdminDto;
import com.harbor.service.AdminService;

import net.minidev.json.writer.BeansMapper.Bean;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	

	@RequestMapping(value="/registeradmin",method=RequestMethod.GET)
	public String showAdmin(@ModelAttribute("admincmd") AdminCommand admincmd) {
		return "admin";
	}
	
	
	@RequestMapping(value="/registeradmin",method=RequestMethod.POST)
	public  String registrationAdmin(Map<String,Object>map,@ModelAttribute("admincmd") AdminCommand admincmd) {
		String result=null;
		AdminDto adto=null;
		
		//copy cmd to dto
		adto=new AdminDto();
	    BeanUtils.copyProperties(admincmd,adto);
		
		//use service
		result=adminservice.registration(adto);
		map.put("result", result);
		return "admin";
	}

}
