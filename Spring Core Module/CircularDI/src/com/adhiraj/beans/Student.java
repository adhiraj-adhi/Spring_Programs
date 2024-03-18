package com.adhiraj.beans;

public class Student {
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void stdDisplay() {
		System.out.println("I'm in Student class and Teacher: "+teacher);
	}
}
