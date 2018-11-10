package com.harbor.service;

import java.util.List;

import com.harbor.dto.Doctor_HospitalDto;
import com.harbor.dto.HospitalDiseasesDto;
import com.harbor.dto.HospitalDoAndDontsDto;
import com.harbor.dto.HosptialDto;

public interface Doctor_HospitalService {
	
	public List<Doctor_HospitalDto> getallData(long id);
	
	public List<HospitalDiseasesDto> getPatientdisease(long id);
	
	
	public HosptialDto getHospitalInfo(long id);
	
	
	
	public List<HospitalDoAndDontsDto> getAllDoAndDontsByID(long id);

}
