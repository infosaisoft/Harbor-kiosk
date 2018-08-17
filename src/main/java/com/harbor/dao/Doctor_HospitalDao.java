package com.harbor.dao;

import java.util.List;

import com.harbor.domain.Doctor_hosptialBo;
import com.harbor.domain.PatientDiseasesBo;

public interface Doctor_HospitalDao {
	
	public List<Doctor_hosptialBo> getallInformation();
	
	public PatientDiseasesBo getPatientdiesease(String pid);

}
