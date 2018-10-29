package com.harbor.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.harbor.rootconfig.PersistentConfig;
import com.harbor.rootconfig.SecurityConfig;
import com.harbor.rootconfig.ServiceConfig;

@SpringBootApplication
@Import(value= {PersistentConfig.class,SecurityConfig.class, ServiceConfig.class})
public class HarborKioskApplication {
	
	

	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

	public static void main(String[] args) {
		SpringApplication.run(HarborKioskApplication.class, args);
	}
}
