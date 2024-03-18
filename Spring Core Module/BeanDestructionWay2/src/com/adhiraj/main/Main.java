package com.adhiraj.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		// In this case we will be using AbstractApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdObj");
		std.display();
		
		context.registerShutdownHook();
	}
}
