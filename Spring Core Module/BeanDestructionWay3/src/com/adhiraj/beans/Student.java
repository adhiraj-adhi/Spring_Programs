package com.adhiraj.beans;

import javax.annotation.PreDestroy;

public class Student {
	private String name;
	private int roll;
	
	public void display() {
		System.out.println("Name:" +name);
		System.out.println("Roll:" +roll);
	}
	
	// custom init method:
	public void initStdObj() {
		System.out.println("init method invoked");
		name = "Adhiraj";
		roll = 101;
	}
	
	@PreDestroy
	public void destroyStdObj() {
		System.out.println("destroy method (way3) invoked");
		name="";
		roll=0;
	}
	
}
