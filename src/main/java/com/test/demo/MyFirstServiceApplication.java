package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstServiceApplication {

	public static void main(String[] args) {
		System.out.println("--------------------------Before starting application");
		SpringApplication.run(MyFirstServiceApplication.class, args);
		System.out.println("--------------------------after starting application");
	}

}
