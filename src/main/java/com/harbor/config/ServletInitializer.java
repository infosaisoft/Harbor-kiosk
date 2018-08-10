package com.harbor.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.harbor.rootconfig.WebMvcConfig;


public class ServletInitializer extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HarborKioskApplication.class, WebMvcConfig.class);
	}

}
