package com.adhiraj.factory;

import com.adhiraj.beans.Student;

public class StudentFactory {
	public Student stdObjCreator() {
		System.out.println("Instance factory method invoked");
		return new Student(10);
	}
}
