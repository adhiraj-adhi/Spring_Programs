package com.adhiraj.beans;

public class Student {
	private String name;
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Hello "+name+", you obtained "+marks+" marks");
	}
}
