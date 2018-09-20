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
	public String registation(HosptialDto hdto) {
	HosptialBo hbo=null;
	int count=0;
	String uuid = null;
	
	CustomIdGenrater id=null;
	
	id=new CustomIdGenrater();
	System.out.println("dao");
	long uid=id.getID();
	
	uuid=String.valueOf(uid);
	uuid="HID-"+uuid;
	
	hdto.setHid(uuid);
	String hosId = hdto.getHid();
	
	 //copy dto to bo
	hbo=new HosptialBo();	

	BeanUtils.copyProperties(hdto, hbo);
	
	
	//use dao
	count=dao.insertHospital(hbo);
	if(count==0) {
		return "failed";
	}
		return hosId;
	}

}
