package com.harbor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.harbor.domain.Doctor_hosptialBo;
import com.harbor.domain.PatientDiseasesBo;

@Repository
public class Doctor_HospitalDaoImpl implements Doctor_HospitalDao {
	private static final String get_all_query="select id,name,address,city,state,pincode,contact from hospitals";
	
	private static final String get_patient_diseases="SELECT do_dont_name,do_dont_videos,do_dont_img FROM hospital_dos_donts WHERE hospital_id=?";

	
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Doctor_hosptialBo> getallInformation() {
	List<Doctor_hosptialBo>listbo=null;
	
	listbo=jt.query(get_all_query, new ResultSetExtractor<List<Doctor_hosptialBo>>() {

		@Override
		public List<Doctor_hosptialBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
		 List<Doctor_hosptialBo>listbo=null;
		 Doctor_hosptialBo bo=null;
			while(rs.next()) {
				bo=new Doctor_hosptialBo();
				bo.setHospital_id(rs.getString(1));
				
				bo.setHospital_name(rs.getString(2));
				bo.setHospital_address(rs.getString(3));
				bo.setCity(rs.getString(4));
				bo.setCity(rs.getString(5));
				bo.setDoctor_contact_no(rs.getString(6));
				
				listbo=new ArrayList<>();
				listbo.add(bo);
				
			}
			return listbo;
		}
		
		
	});
		return listbo;
	}
	
	
	
	
	//diseases information get
	
	@Override
	public PatientDiseasesBo getPatientdiesease(String pid) {
		PatientDiseasesBo bo=null;

		bo=jt.queryForObject(get_patient_diseases, new RowMapper<PatientDiseasesBo>() {

			@Override
			public PatientDiseasesBo mapRow(ResultSet rs, int index) throws SQLException 
			{
				PatientDiseasesBo bo=null;
				
				bo=new PatientDiseasesBo();
					bo.setDiet_chart(rs.getString(1));
					bo.setExercises(rs.getString(2));
					bo.setDo_and_donts(rs.getString(3));		
				return bo;
			}
			
			
			
		}, pid);
		return bo;
	}
	
	
	
	
}
