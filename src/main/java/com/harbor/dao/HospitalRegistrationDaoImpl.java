package com.harbor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.HosptialBo;

@Repository
public class HospitalRegistrationDaoImpl implements HospitalRegistrationDao {
	private static final String INSERT_HOSPITAL="INSERT INTO hosptials (Registration_Number,Name,Address,phNumber,Hospital_Logo) VALUES(?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;
	@Override
	public int insertHospital(HosptialBo hbo) {
	     int count=0;
	     CustomIdGenrater id=null;
	
			id=new CustomIdGenrater();
			System.out.println("dao");
			long uid=id.getID();
			
			String uuid=String.valueOf(uid);
			uuid="HID-"+uuid;
	
	     
	     count=jt.update(INSERT_HOSPITAL, uuid,hbo.getName(),hbo.getAddress(),hbo.getPhNumber(),hbo.getHospitalLogo());
		 System.out.println(hbo.getName());
		return count;
	}

}
