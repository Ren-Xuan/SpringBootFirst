package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${person.last-name}")
	private String lastName;
	
	
	@RequestMapping("/sayHello")
	public String say() {
		return "hello:"+lastName;
	}
}
