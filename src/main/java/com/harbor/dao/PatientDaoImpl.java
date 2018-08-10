package com.harbor.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.domain.PatientRegistration;

@Repository
public class PatientDaoImpl implements PatientDao {
	
	private static final String INSERT_QUERY="INSERT INTO PatientRegistration (PatientName,PatientContact,PatientAadhar) VALUES(?,?,?)";
	@Autowired
       JdbcTemplate jt;
	
	@Override
	public int insertPatient(PatientRegistration PatReg) {
		int count=0;
		count=jt.update(INSERT_QUERY, PatReg.getPatientName(),PatReg.getPatientContact(),PatReg.getPatientAadhar());
		System.out.println(PatReg.getPatientAadhar());
		return count;
	}

}
