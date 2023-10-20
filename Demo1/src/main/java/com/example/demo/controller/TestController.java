package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserRepository;
import com.example.demo.service.UserService;

@RestController
public class TestController {
	
	//localhost:8080/h2-console
	//
	
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String print() {
		
		return "HELLO....";
	}
	
	@GetMapping("/save/user")
	public User saveUser(String name) {
		
		User result=userService.findUserByUserName(name);
		System.out.println("user saved");
		return result;
	}

	@GetMapping("/getUser")
	public List<User> saveUser() {
		
		List<User> result=userService.findAll();
		System.out.println("user saved");
		return result;
	}

}
