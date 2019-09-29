package com.tcf.cloud.eureka.server.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@RequestMapping("/start.do")
	public String startEurekaServer()
	{
		return "Eureka Server";
	}
	
}
