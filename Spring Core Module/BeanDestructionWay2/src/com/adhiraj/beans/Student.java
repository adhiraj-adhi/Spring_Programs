package com.adhiraj.beans;

import org.springframework.beans.factory.DisposableBean;

public class Student implements DisposableBean {
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

	// implementing destroy() method of DisposableBean interface
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method (way2) invoked");
		name="";
		roll = 0;
	}
	
}
