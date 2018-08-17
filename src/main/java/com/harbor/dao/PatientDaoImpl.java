package com.harbor.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.PatientRegistration;

@Repository
public class PatientDaoImpl implements PatientDao {
	
	private static final String INSERT_QUERY="INSERT INTO PatientRegistration (PatientID,PatientName,PatientContact,PatientAadhar) VALUES(?,?,?,?)";
	@Autowired
       JdbcTemplate jt;
	
	@Override
	public int insertPatient(PatientRegistration PatReg) {
		int count=0;
		
		CustomIdGenrater id=null;
		
		id=new CustomIdGenrater();
		System.out.println("dao");
		long uid=id.getID();
		
		String uuid=String.valueOf(uid);
		uuid="PID-"+uuid;

		count=jt.update(INSERT_QUERY, uuid,PatReg.getPatientName(),PatReg.getPatientContact(),PatReg.getPatientAadhar());

		return count;
	}

}
