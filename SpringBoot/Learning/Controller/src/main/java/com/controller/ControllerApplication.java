package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// This finds the controllers in packages. Because sometimes it does finds itself.
//@ComponentScan("com.controller.controllerPackage1")

//To provide multiple find location
@ComponentScan({"com.controller.controllerPackage1", "com.controller.controllerPackage2", "com.controller.entity"})

// If wants to provide only specific classes.
//@ComponentScan(basePackageClasses = {com.controller.controllerPackage1.Welcome.class, com.controller.controllerPackage2.IssueController.class})

@SpringBootApplication
public class ControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}

}
