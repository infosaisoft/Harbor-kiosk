package com.harbor.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.dao.Doctor_HospitalDao;
import com.harbor.domain.Doctor_hosptialBo;
import com.harbor.domain.PatientDiseasesBo;
import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.PatientDiseasesDto;
import com.harbor.dto.PatientDto;

@Service
public class Doctor_HospitalSerieImpl implements Doctor_HospitalService {
	
	
	

	



	@Autowired
	Doctor_HospitalDao dhdao;
	
	@Override
	public List<Doctor_HospitalDto> getallData() {
	List<Doctor_HospitalDto>listdto=new ArrayList<>();
	List<Doctor_hosptialBo>listbo=null;
	
	//use dao
	listbo=dhdao.getallInformation();
	
	listbo.forEach(bo->{
		
		Doctor_HospitalDto dto=new Doctor_HospitalDto();
		BeanUtils.copyProperties(bo, dto);
		
		listdto.add(dto);
		
	});
	
		return listdto;
	}
	
	
	@Override
	public PatientDiseasesDto getPatientdisease(String pid) {
		
 
		
		PatientDiseasesBo pbo=null;
		PatientDiseasesDto pdto=null;
		//use dao
		pbo=dhdao.getPatientdiesease(pid);
		//copy bo to dto
		pdto=new PatientDiseasesDto();
	
		BeanUtils.copyProperties(pbo, pdto);
		
	
		return pdto;
	}
}
