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
}
