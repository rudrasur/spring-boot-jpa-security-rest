package com.test.demo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.test.demo.dao.User;

@Component
@Aspect
public class UserServiceAspect {

	@Before(value = "execution(* com.test.demo.service.UserService.save*(..)) and args(user,..)")
	public void beforeAdvice(JoinPoint joinPoint, User user) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating user with name - " + user.getName());
	}
	
	@Before(value = "execution(* com.test.demo.service.UserService.get*(..)) and args(id,..)")
	public void beforeAdvice(JoinPoint joinPoint, Integer id) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Getting user ID - " + id);
	}
	
	@After(value = "execution(* com.test.demo.service.UserService.get*(..)) and args(id,..)")
	public void afterAdvice(JoinPoint joinPoint, Integer id) {
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("returning user for ID - " + id);
	}
	
}
