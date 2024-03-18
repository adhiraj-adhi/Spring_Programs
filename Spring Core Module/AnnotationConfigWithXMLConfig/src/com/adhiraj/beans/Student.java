package com.adhiraj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stdObj")
public class Student {
	@Value("Abhinav")
	private String name;
	
	@Value("101")
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void display() {
		System.out.println("Student name is: "+name+" and roll is: "+roll);
	}
}
