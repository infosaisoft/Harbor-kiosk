package com.harbor.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.common.CustomIdGenrater;
import com.harbor.domain.Departmentbo;

@Repository
public class DepatrmentDaimpl implements DepatmentDao {
	private static final String Insert_Depatment_query="insert into department (dptid,dptName,dptLocation,hid) values(?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insert(Departmentbo dbo) {
		int count=0;
		String m[]=dbo.getDptName();
		String n[]=dbo.getDptLocation();
		 CustomIdGenrater id=null;
			
			id=new CustomIdGenrater();
			System.out.println("dao");
			long uid=id.getID();
			
			String dpt=String.valueOf(uid);
			dpt="dpt-"+dpt;
	
		
		for(int i=0;i<m.length;i++)
		{

		count=jt.update(Insert_Depatment_query,dpt,m[i],n[i],"1234");
		}

		return count;
	}

}
