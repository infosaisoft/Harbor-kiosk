package com.harbor.service;

import java.util.List;

import com.harbor.domain.HosptialBo;
import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.HosptialDto;
import com.harbor.dto.PatientDiseasesDto;
import com.harbor.dto.PatientDto;

public interface Doctor_HospitalService {
	
	public List<Doctor_HospitalDto> getallData();
	
	public PatientDiseasesDto getPatientdisease(String pid);
	
	
	public HosptialDto getHospitalInfo(long id);

}
