package com.harbor.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SetCompliteController {
 
	HttpSession ses=null;
	
	@RequestMapping(value="setupcomplite",method=RequestMethod.GET)
	public String setUpComplite(HttpServletRequest req,Map<String, Object>map) {
	   long id=0;
		ses=req.getSession();
	id=(long) ses.getAttribute("id");
	      map.put("id", id);
		return "setupcomplite";
	}
	
}
