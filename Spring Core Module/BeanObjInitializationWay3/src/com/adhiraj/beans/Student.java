package com.adhiraj.beans;

import javax.annotation.PostConstruct;

public class Student {
	private String name;
	private int roll;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}


	@PostConstruct
	public void initStdObj() {
		name = "Yishu";
		roll = 101;
	}
}
