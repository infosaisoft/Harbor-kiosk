package com.harbor.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.common.CustomIdGenrater;
import com.harbor.dao.HospitalRegistrationDao;
import com.harbor.domain.HosptialBo;
import com.harbor.dto.HosptialDto;

@Service
public class RegistrationHospitalServiceImpl implements RegistrationHospitalService {
	
	@Autowired
	private HospitalRegistrationDao dao;
	
	@Override
	public String registation(HosptialDto hdto)throws Exception {
	HosptialBo hbo=null;
	int count=0;
	
	 //copy dto to bo
	hbo=new HosptialBo();	

	BeanUtils.copyProperties(hdto, hbo);
	
	
	//use dao
	count=dao.insertHospital(hbo);
	
	      hdto.setId(hbo.getId());
	if(count==0) {
		return "failed"+count;
	}
		return "success"+count;
	}

	

}
