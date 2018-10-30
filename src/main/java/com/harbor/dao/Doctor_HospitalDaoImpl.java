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
import com.harbor.domain.HosptialBo;
import com.harbor.domain.PatientDiseasesBo;

@Repository
public class Doctor_HospitalDaoImpl implements Doctor_HospitalDao {
	private static final String get_all_query="SELECT t2.name,t1.name,t1.address,t1.gender,t1.address,t1.city FROM  doctors t1 INNER JOIN hospitals t2 ON t1.id=t2.id";
	private static final String get_patient_diseases="SELECT do_dont_name,do_dont_videos,do_dont_img FROM hospital_dos_donts WHERE hospital_id=?";


	 private static final String HOSPITAL_Query="SELECT NAME,ADDRESS,CITY,CONTACT,LOGO,REN-NUMBER,STATE FROM HOSPITALS WHERE ID=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Doctor_hosptialBo> getallInformation() {
	List<Doctor_hosptialBo>listbo=null;
	
	listbo=jt.query(get_all_query, new ResultSetExtractor<List<Doctor_hosptialBo>>() {

		@Override
		public List<Doctor_hosptialBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
		 List<Doctor_hosptialBo>listbo=	listbo=new ArrayList<>();;
		 
			while(rs.next()) {
				Doctor_hosptialBo bo=null;
				bo=new Doctor_hosptialBo();			
				bo.setHospital_name(rs.getString(1));   
				bo.setDoctor_name(rs.getString(2));
				bo.setGender(rs.getString(3));
				bo.setHospital_address(rs.getString(4));
				//bo.setState(rs.getString(5));
				//bo.setPincode(rs.getString(6));
				bo.setHospital_contact(rs.getString(5));
				bo.setCity(rs.getString(6));
			
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
	
	
	@Override
	public HosptialBo getHospitalInfoByID(long id) {
	 HosptialBo hbo=null;
	 
	 hbo=jt.queryForObject(HOSPITAL_Query, new RowMapper<HosptialBo>()
	 {

				@Override
				public HosptialBo mapRow(ResultSet rs, int index) throws SQLException {
				  HosptialBo bo=new HosptialBo();
				  
				  bo.setName(rs.getString(1));
				  bo.setAddress(rs.getString(2));
				  bo.setCity(rs.getString(3));
				  bo.setContact(rs.getString(4));
				  bo.setPincode(rs.getString(5));
				  bo.setState(rs.getString(6));
				  bo.setReg_number(rs.getString(7));
					return bo;
				}
	}, id);
	
		return hbo;
	}
	
	
	
}
