package com.harbor.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.harbor.domain.Departmentbo;

@Repository
public class DepatrmentDaimpl implements DepatmentDao {
	private static final String Insert_Depatment_query = "insert into departments (name,location,hospital_id) values(?,?,?)";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int[] insert(List<Departmentbo> dbo) {
		int result[]=null;
		
		result=jt.batchUpdate(Insert_Depatment_query, new BatchPreparedStatementSetter() {
			
			
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1,dbo.get(i).getDptName());
				ps.setString(2, dbo.get(i).getDptLocation());
				ps.setLong(3, dbo.get(i).getHid());
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return dbo.size();
			}
		});
		return result;
	}

}
