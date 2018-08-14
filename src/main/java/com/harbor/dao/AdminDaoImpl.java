package com.harbor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.AdminBo;

@Repository
public class AdminDaoImpl implements AdminDao {

	private static final String Insert_query_Admin = "insert into hospital_admin(admin_id,hid,admin_name,admin_email,admin_password,admin_moNumber) values(?,?,?,?,?,?)";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insert(AdminBo abo) {
	int count=0;
	 CustomIdGenrater id=null;
		String password=null;
		id=new CustomIdGenrater();
	
		long uid=id.getID();
		
		String uuid=String.valueOf(uid);
	   String aid="aid-"+uuid;
	  String hid="hid-"+uuid;
	  password=id.generateHash(abo.getAdmin_password());
	count=jt.update(Insert_query_Admin, aid,hid,abo.getAdmin_name(),abo.getAdmin_email(),password,abo.getAdmin_moNumber());
		
		return count;
	}

}
