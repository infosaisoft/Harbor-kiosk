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
import com.harbor.domain.HospitalDiseasesBo;
import com.harbor.domain.HosptialBo;


@Repository
public class Doctor_HospitalDaoImpl implements Doctor_HospitalDao {
	private static final String get_all_query="SELECT doctors.id,doctors.name,doctors.city,doctors.address,doctors.email,doctors.gender,doctors.state,doctors.qualification FROM doctors,doctor_departments,departments WHERE departments.id=doctor_departments.department_id AND doctors.id=doctor_departments.doctor_id AND departments.hospital_id=?";
	private static final String get_patient_diseases="SELECT NAME,IMAGES,VIDEOS,DESCRIPTION  FROM hospital_diseases WHERE hospital_id=?;";


	 private static final String HOSPITAL_Query="SELECT NAME,ADDRESS,CITY,CONTACT,LOGO,REG_NUMBER,STATE,logo FROM HOSPITALS WHERE ID=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Doctor_hosptialBo> getallInformation(long id) {
	List<Doctor_hosptialBo>listbo=null;
	
	listbo=jt.query(get_all_query, new ResultSetExtractor<List<Doctor_hosptialBo>>() {

		@Override
		public List<Doctor_hosptialBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
		 List<Doctor_hosptialBo>listbo=	listbo=new ArrayList<>();
		 
			while(rs.next()) {
				Doctor_hosptialBo bo=null;
				bo=new Doctor_hosptialBo();			
				bo.setDid(rs.getLong(1));
				bo.setDoctor_name(rs.getString(2));
				bo.setCity(rs.getString(3));
				bo.setHospital_address(rs.getString(4));
				bo.setEmail(rs.getString(5));
				bo.setGender(rs.getString(6));
				bo.setState(rs.getString(7));
				bo.setQulification(rs.getString(8));
			
				listbo.add(bo);
				
			}
			return listbo;
		}
		
		
	},id);
		return listbo;
	}
	
	
	
	
	//diseases information get
	
	@Override
	public List<HospitalDiseasesBo> getPatientdiesease(long hid) {
	List<HospitalDiseasesBo>  listhdbo=null;
	listhdbo=jt.query(get_patient_diseases, new ResultSetExtractor<List<HospitalDiseasesBo>>() {

					@Override
					public List<HospitalDiseasesBo> extractData(ResultSet rs)
							throws SQLException, DataAccessException {
						List<HospitalDiseasesBo>listbo=new ArrayList<>();
						HospitalDiseasesBo bo=null;
						while(rs.next()) {
							bo=new HospitalDiseasesBo();
							bo.setName(rs.getString(1));
							bo.setImages(rs.getString(2));
							bo.setVideos(rs.getString(3));
							bo.setDiscriptions(rs.getString(4));
							listbo.add(bo);
						}
						
						return listbo;
					}
                	
                	
				},hid);
	              return listhdbo;
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
				  bo.setLogo(rs.getString(8));
					return bo;
				}
	}, id);
	
		return hbo;
	}
	
	
	
}
