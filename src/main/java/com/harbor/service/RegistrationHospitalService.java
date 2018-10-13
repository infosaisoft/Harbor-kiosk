package com.harbor.service;

import com.harbor.dto.HosptialDto;
import com.harbor.validation.FieldValueExists;

public interface RegistrationHospitalService extends FieldValueExists{
	
	public String registation (HosptialDto hdto)throws Exception;

}
