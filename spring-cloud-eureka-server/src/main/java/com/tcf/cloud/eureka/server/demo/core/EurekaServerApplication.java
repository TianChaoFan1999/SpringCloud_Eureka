package com.tcf.cloud.eureka.server.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.tcf.cloud.eureka.server.demo"})
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(EurekaServerApplication.class,args);
	}
	
}
