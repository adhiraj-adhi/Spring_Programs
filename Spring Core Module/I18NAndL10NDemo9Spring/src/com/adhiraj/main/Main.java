package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adhiraj.beans.Student;
import com.adhiraj.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1 = (Student) context.getBean("stdObj");
		
		std1.display();
	}
}
