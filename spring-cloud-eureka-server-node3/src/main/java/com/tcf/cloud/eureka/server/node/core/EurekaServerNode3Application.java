package com.tcf.cloud.eureka.server.node.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * TODO TCF Eureka注册中心备机1号启动类
 * @author 71485
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.tcf.cloud.eureka.server.node"})
@EnableEurekaServer
public class EurekaServerNode3Application {

	public static void main(String[] args) 
	{ 
		SpringApplication.run(EurekaServerNode3Application.class,args);
	}
	
}
