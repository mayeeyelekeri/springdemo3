package com.mine.springdemo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${springboot.message:def_value}")
	String message; 
	
	@Value("${springboot.ipAddress:0.0.0.0}")
	String ipAddress; 
	
	@GetMapping("/")
	public String index() {
		System.out.println("IP Address is " + ipAddress); 
		return "Greetings from Spring Boot! , message is : " + message;
	}

}