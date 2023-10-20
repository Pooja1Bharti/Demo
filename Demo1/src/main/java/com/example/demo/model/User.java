package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private long id;
	private String userName;
	private String password;
	
	
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public User(int i, String string, String string2) {
		super();
		this.id=id;
		this.userName = userName;
		this.password = password;
		// TODO Auto-generated constructor stub
	}


	public String getUserName() {
		return userName;
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
