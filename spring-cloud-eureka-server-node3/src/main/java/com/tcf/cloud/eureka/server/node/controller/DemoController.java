package com.tcf.cloud.eureka.server.node.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@RequestMapping("/show.do")
	public String show()
	{
		return "2号备机:8085";
	}
	
}
