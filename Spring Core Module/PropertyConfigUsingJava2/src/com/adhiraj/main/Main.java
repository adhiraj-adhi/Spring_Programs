package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adhiraj.beans.Student;
import com.adhiraj.resources.JavaConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		Student std = (Student) context.getBean("stdObj");
		std.display();
	}
}
