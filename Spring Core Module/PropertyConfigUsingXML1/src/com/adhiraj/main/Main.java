package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
		Student std = (Student) context.getBean("stdObj");
		// One of alternative of type-casting is:
//		Student std = context.getBean("stdObj", Student.class);
		std.display();
	}
}
