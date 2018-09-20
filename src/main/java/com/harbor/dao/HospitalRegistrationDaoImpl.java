package com.harbor.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.HosptialBo;

@Repository
public class HospitalRegistrationDaoImpl implements HospitalRegistrationDao {
	private static final String INSERT_HOSPITAL="INSERT INTO hospitals (hid,name,address,city,state,pincode,contact,reg_number,logo,creation_date) VALUES(?,?,?,?,?,?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int insertHospital(HosptialBo hbo) {
	     int count=0;
	     	     
	     count=jt.update(INSERT_HOSPITAL, hbo.getHid(),hbo.getName(),hbo.getAddress(),hbo.getCity(),hbo.getState(),hbo.getPincode(),hbo.getContact(),hbo.getReg_number(),hbo.getLogo(), new Date());
		 
		 return count;
	}	

}
