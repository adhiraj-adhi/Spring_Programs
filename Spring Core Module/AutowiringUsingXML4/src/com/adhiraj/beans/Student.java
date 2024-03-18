package com.adhiraj.beans;

public class Student {
	private String name;
	private int roll;
	private Address address;
	private Subjects subjects;
	
	public Student(String name, int roll, Address address, Subjects subjects) {
		this.name = name;
		this.roll = roll;
		this.address = address;
		this.subjects = subjects;
	}
	
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Address: "+address);
		System.out.println("Subjects: "+subjects);
	}
}
