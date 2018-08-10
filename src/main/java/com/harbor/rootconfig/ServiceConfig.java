package com.harbor.rootconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.harbor.service")
public class ServiceConfig {

}
