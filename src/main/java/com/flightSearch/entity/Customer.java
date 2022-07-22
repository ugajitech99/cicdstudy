package com.flightSearch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Id;
	private String Name;
	private String Email;
	private String message;
	private String number;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Customer(String id, String name, String email, String message, String number) {
		super();
		Id = id;
		Name = name;
		Email = email;
		this.message = message;
		this.number = number;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
