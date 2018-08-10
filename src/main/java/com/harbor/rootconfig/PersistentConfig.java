package com.harbor.rootconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harbor.domain.PatientRegistration;

@Configuration
@ComponentScan(basePackages="com.harbor.dao")
public class PersistentConfig {
	
	@Autowired
	private DataSource ds;
	
	
}
