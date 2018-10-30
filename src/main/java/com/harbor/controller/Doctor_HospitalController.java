package com.harbor.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harbor.command.DoctorHospitalCommand;
import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.PatientDiseasesDto;
import com.harbor.dto.PatientDto;
import com.harbor.service.Doctor_HospitalService;

@Controller
public class Doctor_HospitalController {
	
	@Autowired
	Doctor_HospitalService docservice=null;
	
	HttpSession ses=null;
	
	@RequestMapping(value="/getalldoctro",method=RequestMethod.GET)
	public  String  viewAllDoctor(Map<String, Object>map,HttpServletRequest req){
		List<Doctor_HospitalDto>listdto=null;
		long id=0;
		ses=req.getSession();
		//id=(long) ses.getAttribute("id");
		listdto=docservice.getallData();
		map.put("listdto", listdto);
		return "doctor";
	}
	
	@RequestMapping(value="/getdiseases",method=RequestMethod.GET)
	public String viewDisease(@RequestParam("pid") String pid,@ModelAttribute("doccmd")DoctorHospitalCommand doccmd,Map<String,Object>map){
		 PatientDiseasesDto pdto=null;
		 pdto=docservice.getPatientdisease(pid);
		 
		 
			
	      System.out.println("ggg"+pdto.getDo_and_donts());
		 //copy dto to cmd
       BeanUtils.copyProperties(pdto, doccmd);
       map.put("docmd",doccmd);
		return "doctor";
	}
	
	
	
	

}
