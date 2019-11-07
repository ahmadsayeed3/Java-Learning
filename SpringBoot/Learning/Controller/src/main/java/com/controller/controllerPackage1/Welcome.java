package com.controller.controllerPackage1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to SpringBoot Learning";
	}

	// There are several ways to write Controller Method
	
	// #1
	@RequestMapping(path = "/1")
	public String welcome1() {
		return "Welcome to SpringBoot Learning #1";
	}

	// #2
	@RequestMapping(path = "/2")
	@ResponseBody
	public String welcome2() {
		return "Welcome to SpringBoot Learning #2 YOYOWOWOW";
	}

}
