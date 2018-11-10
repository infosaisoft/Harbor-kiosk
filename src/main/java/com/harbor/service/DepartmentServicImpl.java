package com.harbor.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.common.CustomIdGenrater;
import com.harbor.dao.DepatmentDao;
import com.harbor.domain.Departmentbo;
import com.harbor.dto.DepartmentDto;

@Service
public class DepartmentServicImpl implements DepartmentService {
	
	@Autowired
	DepatmentDao dptDao;

	@Override
	public String registration(List<DepartmentDto> ddto) {
	   List<DepartmentDto>listdto=new ArrayList<>();
	   
		List<Departmentbo> dptbo=new ArrayList<>();
		
		int result[]=null;
		//Convert listDTO to listBO
		ddto.forEach(dto->{
			Departmentbo bo=new Departmentbo();
			BeanUtils.copyProperties(dto,bo);
			dptbo.add(bo);
		});

		result=dptDao.insert(dptbo);
		if(result != null) {
			return "success";
		}
		return "fail";
	}

}
