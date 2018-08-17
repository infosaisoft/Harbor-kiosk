package com.harbor.service;

import java.util.List;

import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.PatientDiseasesDto;
import com.harbor.dto.PatientDto;

public interface Doctor_HospitalService {
	
	public List<Doctor_HospitalDto> getallData();
	
	public PatientDiseasesDto getPatientdisease(String pid);

}
