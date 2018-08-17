package com.harbor.service;

import java.util.Arrays;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.dao.DepatmentDao;
import com.harbor.domain.Departmentbo;
import com.harbor.dto.DepartmentDto;

@Service
public class DepartmentServicImpl implements DepartmentService {
	
	@Autowired
	DepatmentDao dptDao;

	@Override
	public String registration(DepartmentDto ddto) {
	
		Departmentbo dptbo=null;
		int count=0;
		//copy dto to bo
		dptbo=new Departmentbo();
		
		BeanUtils.copyProperties(ddto, dptbo);
	
		String m[]=dptbo.getDptName();
		String n[]=dptbo.getDptLocation();
		count=dptDao.insert(dptbo);
		
		if(count==0) {
			return "fail";
		}
		return "success";
	}

}
