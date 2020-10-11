package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true) 
public class MyFirstServiceApplication {

	public static void main(String[] args) {
		System.out.println("--------------------------Before starting application");
		SpringApplication.run(MyFirstServiceApplication.class, args);
		System.out.println("--------------------------after starting application");
	}

}
