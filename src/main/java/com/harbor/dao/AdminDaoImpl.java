package com.harbor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.AdminBo;

@Repository
public class AdminDaoImpl implements AdminDao {

	private static final String Insert_query_Admin = "insert into hospital_staff(hospital_id,email,contact,name,user_id) values(?,?,?,?,?)";
	private static final String INSERT_USER_QUERY="INSERT INTO USERS(USERNAME,PASSWORD,ROLE) VALUES(?,?,?)";
	
	private static final String GET_USER_ID_QUERY="SELECT id FROM users WHERE username=? AND PASSWORD=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insert(AdminBo abo) {
	int count=0;
	 long id=0;          
	 int count1=0;
	       count1=jt.update(INSERT_USER_QUERY,abo.getUsername() ,abo.getAdmin_password(),abo.getRole());
	        if(count1==1) {
	 id=  jt.queryForObject(GET_USER_ID_QUERY, Long.class, abo.getUsername(),abo.getAdmin_password());
	        }
	 abo.setUser_id(id);
	 count=jt.update(Insert_query_Admin, abo.getHid(),abo.getAdmin_email(),abo.getAdmin_moNumber(),abo.getAdmin_name(),abo.getUser_id());
		
		return count;
	}

}
