package com.harbor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.harbor.command.LoginCommand;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String showLogin(@ModelAttribute("loginPage") LoginCommand loginPage) {
		
		return "login";
	}
	

}
