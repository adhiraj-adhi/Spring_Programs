package com.adhiraj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Adhiraj")
	private String name;
	
	@Value("#{addrId.city}")
	private String city;
	
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Hello "+name);
		System.out.println("City: "+city);
	}
}
