package com.harbor.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.domain.Departmentbo;

@Repository
public class DepatrmentDaimpl implements DepatmentDao {
	private static final String Insert_Depatment_query="insert into departments (name,location,hospital_id) values(?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insert(Departmentbo dbo) {
		int count=0;
		String m[]=dbo.getDptName();
		String n[]=dbo.getDptLocation();
	
		
		for(int i=0;i<m.length;i++)
		{
		count=jt.update(Insert_Depatment_query,m[i],n[i],dbo.getHid());
		}

		return count;
	}
	
	
	
	

}
