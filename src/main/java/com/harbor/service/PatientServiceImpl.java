package com.harbor.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.common.CustomIdGenrater;
import com.harbor.dao.PatientDao;
import com.harbor.domain.PatientRegistration;
import com.harbor.dto.PatientDto;


@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientDao PatDao;
	
	@Override
	public String registerPatient(PatientDto PatDto) {
		
		int msg = 0;
		PatientRegistration PatReg = null;
		// Copy dto to domain
		PatReg = new PatientRegistration();
		BeanUtils.copyProperties(PatDto, PatReg);

		msg = PatDao.insertPatient(PatReg);
		if (msg == 0) {
			return "Failed";
		}else {
			return "Success";
		}
		
	}

}
