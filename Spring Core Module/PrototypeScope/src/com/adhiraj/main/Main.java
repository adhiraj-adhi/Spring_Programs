package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adhiraj.beans.Student;
import com.adhiraj.resources.JavaConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		Student std1 = (Student) context.getBean("stdObj1");
		Student std2 = (Student) context.getBean("stdObj1");
		System.out.println(std1 == std2);  // O/P: false
		/*
		 * Here, o/p is false because even though both the objects (i.e. std1 and std2) 
		 * share same bean definitions they are created as separate instance due to 
		 * prototype scope.
		 * */
	}
}
