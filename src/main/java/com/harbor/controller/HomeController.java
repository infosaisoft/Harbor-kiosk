package com.harbor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String home(HttpServletRequest req) {
		
		String hid = (String) req.getAttribute("result");
		System.out.println(hid);
		return "home";
	}

}
