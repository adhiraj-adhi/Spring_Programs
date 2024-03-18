package com.adhiraj.beans;

public class Student {
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Name of Student Is :"+this.name);
		System.out.println("Roll of Student Is :"+this.rollno);
		// Here, using this keyword is not mandatory.
	}
}
