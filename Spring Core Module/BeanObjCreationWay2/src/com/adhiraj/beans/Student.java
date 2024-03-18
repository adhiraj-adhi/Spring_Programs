package com.adhiraj.beans;

public class Student {
	private String name;
	private int roll;
	
	public Student(int a) {
		System.out.println("Parametrized Constructor Invoked");
	}
	
	public void display() {
		System.out.println("Name: "+name+" and roll: "+roll);
	}
	
	public static Student createStdObj() {
		System.out.println("Static Factory Method Invoked");
		return new Student(10);
	}
}
