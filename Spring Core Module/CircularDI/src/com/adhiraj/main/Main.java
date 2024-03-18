package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;
import com.adhiraj.beans.Teacher;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdObj");
		std.stdDisplay();
		System.out.println("-----------------------------------------------");
		Teacher teacher = (Teacher) context.getBean("teacObj");
		teacher.teacDisplay();
	}
}

/*
 * O/P:
 * I'm in Student class and Teacher: com.adhiraj.beans.Teacher@4df50bcc
 * -----------------------------------------------
 * I'm in Teacher class and Student: com.adhiraj.beans.Student@6b26e945
 * 
 * */
