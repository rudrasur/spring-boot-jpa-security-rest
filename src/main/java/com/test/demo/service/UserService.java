package com.test.demo.service;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.dao.User;
import com.test.demo.dao.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	private Logger log;
	
	public String saveUser(User user) {
		repository.save(user);
		return "User object saved";
	}
	
	public User getUser(Integer id) {
		System.out.println("--------------getUser invoked---------------");
		Optional<User> user = repository.findById(id);
		if (user.isPresent()) return user.get();
		return null;
	}
}
