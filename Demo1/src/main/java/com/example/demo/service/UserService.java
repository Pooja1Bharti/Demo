package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public User findUserByUserName(String name) {
		//if(name != null) {
			
			User user= repo.findByUserName(name);
			
			return user;
			/*
			 * } return null;
			 */
	}

	public List<User> findAll() {
	List<User> user=	 repo.findAll();
	
		return user;
	}
	
	
	

}
