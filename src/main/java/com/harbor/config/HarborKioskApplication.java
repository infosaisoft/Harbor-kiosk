package com.harbor.config;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.harbor.rootconfig.PersistentConfig;
import com.harbor.rootconfig.SecurityConfig;
import com.harbor.rootconfig.ServiceConfig;


@SpringBootApplication
@Import(value= {PersistentConfig.class,SecurityConfig.class, ServiceConfig.class})
public class HarborKioskApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HarborKioskApplication.class, args);
	}
	
	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	

}
