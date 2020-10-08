package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dao.User;

@RestController
public class MyFirstRestController {

	@GetMapping("/hello-url")
	public String hello() {
		System.out.println("my rest service called------------->");
		return "Hello, this is my first rest service";
	}
	
	
	
}
