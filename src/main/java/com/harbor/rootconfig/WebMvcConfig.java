package com.harbor.rootconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.harbor.dto.PatientDto;

@Configuration
@ComponentScan(basePackages="com.harbor.controller")
public class WebMvcConfig {

	@Bean
	public ObjectMapper createMapper() {
		ObjectMapper mapper=null;
		mapper=new ObjectMapper();
		
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
      //  mapper.readValue(JSON, PatientDto.class);
		return mapper;
		
	}
}
