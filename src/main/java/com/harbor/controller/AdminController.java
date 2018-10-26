package com.harbor.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.harbor.command.AdminCommand;
import com.harbor.dto.AdminDto;
import com.harbor.service.AdminService;


@Controller
@SessionAttributes({"id"})
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	HttpSession ses=null;


	@RequestMapping(value="admin",method=RequestMethod.GET)
	public String showAdmin(@ModelAttribute("admincmd") AdminCommand admincmd,HttpServletRequest req) {
      
		return "admin";
	}
	
	
	@RequestMapping(value="admin",method=RequestMethod.POST)
	public  String registrationAdmin(HttpServletRequest req,Map<String,Object>map,@Valid @ModelAttribute("admincmd") AdminCommand admincmd,BindingResult error) {
		String result=null;
		AdminDto adto=null;
		
		ses=req.getSession();
		
		 if(error.hasErrors()) {
		          return "admin";	 
		 }
	
		//copy cmd to dto
		adto=new AdminDto();
	    BeanUtils.copyProperties(admincmd,adto);
		
		adto.setHid((long) ses.getAttribute("id"));
		//use service
		result=adminservice.registration(adto);
		map.put("result", result);
		return "redirect:/department";
	}

}
