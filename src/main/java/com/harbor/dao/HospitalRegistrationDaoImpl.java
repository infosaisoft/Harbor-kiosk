package com.harbor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.HosptialBo;

@Repository
public class HospitalRegistrationDaoImpl implements HospitalRegistrationDao {
	private static final String INSERT_HOSPITAL="INSERT INTO HOSPITAL(NAME,ADDRESS,NUMBER,LOGO) VALUES(?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	@Override
	public int insertHospital(HosptialBo hbo) {
	     int count=0;
	     CustomIdGenrater id=null;
	
			id=new CustomIdGenrater();
			System.out.println("dao");
			id.generateUniqueKeyUsingUUID();
			System.out.println(id);
	     
	     count=jt.update(INSERT_HOSPITAL, hbo.getName(),hbo.getAddress(),hbo.getRegNumber(),hbo.getHospitalLogo());
		 
		return count;
	}

}
