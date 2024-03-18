package com.adhiraj.beans;

public class Teacher {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void teacDisplay() {
		System.out.println("I'm in Teacher class and Student: "+student);
	}
}
