package com.harbor.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.HosptialBo;

@Repository
public class HospitalRegistrationDaoImpl implements HospitalRegistrationDao {
	private static final String INSERT_HOSPITAL="INSERT INTO hospitals (name,address,city,state,pincode,contact,reg_number,logo,created) VALUES(?,?,?,?,?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int insertHospital(HosptialBo hbo)throws Exception {
	     int count=0;
	     	     
	     count=jt.update(INSERT_HOSPITAL,hbo.getName(),hbo.getAddress(),hbo.getCity(),hbo.getState(),hbo.getPincode(),hbo.getContact(),hbo.getReg_number(),hbo.getLogo(), new Date());
		 
		 return count;
	}	

}
