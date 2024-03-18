package com.adhiraj.beans;

public class Student {
	private String name;
	private int roll;
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}
	
	// creating custom init() method:
	public void initStdObj() {
		name = "Adhiraj";
		roll = 101;
	}
}
