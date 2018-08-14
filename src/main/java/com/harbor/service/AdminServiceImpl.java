package com.harbor.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harbor.dao.AdminDao;
import com.harbor.domain.AdminBo;
import com.harbor.dto.AdminDto;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao ado;

	@Override
	public String registration(AdminDto adto) {
	AdminBo abo=null;
	int count=0;
		//copy dto to bo
	abo=new AdminBo();
	    BeanUtils.copyProperties(adto, abo);
	    
	    //use dao
	    count=ado.insert(abo);
	    
	    if(count==0) {
	    	return "fail";
	    }
		return "success";
	}

}
