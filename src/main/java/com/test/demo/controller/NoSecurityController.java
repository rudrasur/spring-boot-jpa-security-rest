package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unsecured")
public class NoSecurityController {
	
	@GetMapping("/one")
	public String no1() {
		return "Hey!, you have no restriction get details from me";
	}
	
	@GetMapping("/two")
	public String no2() {
		return "Hey!, you have no restriction get details from me too";
	}

}
