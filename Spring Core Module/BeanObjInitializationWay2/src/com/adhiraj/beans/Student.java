package com.adhiraj.beans;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean {
	private String name;
	private int roll;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}


	// implementing afterPropertiesSet() method of InitializingBean interface
	/**
	 * This method will run just after any bean is created.
	 * */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet is run");
		name = "Abhinav";
		roll = 111;
	}
}
