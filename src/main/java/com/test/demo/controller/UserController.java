package com.test.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dao.User;
import com.test.demo.dao.UserRepository;
import com.test.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(service.getUser(id), HttpStatus.OK);
	}
	
	@PatchMapping("/user")
	public String updateUser(@RequestBody User user) {
		repository.save(user);
		return "User object updated"; 
	}
	
	@PutMapping("/user")
	public String updateWholeUser(@RequestBody User user) {
		 return service.saveUser(user);
	}
	
	@PostMapping("/user")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@DeleteMapping("/user")
	public String delete(@RequestBody User user) {
		repository.deleteById(user.getId());
		return "Object deleted";
	}
}
