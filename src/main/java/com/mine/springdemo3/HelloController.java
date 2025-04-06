package com.mine.springdemo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${WELCOME_MESSAGE:def_value}")
	String welcomeMessage; 
	
	@GetMapping("/greeting")
	public String index() {
		return "Greetings from Spring Boot! , message is : " + welcomeMessage;
	}

}