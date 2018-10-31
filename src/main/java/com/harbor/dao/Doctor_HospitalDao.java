package com.harbor.dao;

import java.util.List;

import com.harbor.domain.Doctor_hosptialBo;
import com.harbor.domain.HospitalDiseasesBo;
import com.harbor.domain.HosptialBo;


public interface Doctor_HospitalDao {
	
	public List<Doctor_hosptialBo> getallInformation(long id);
	
	public List<HospitalDiseasesBo> getPatientdiesease(long hid);
	
	
	public HosptialBo getHospitalInfoByID(long id);

}
