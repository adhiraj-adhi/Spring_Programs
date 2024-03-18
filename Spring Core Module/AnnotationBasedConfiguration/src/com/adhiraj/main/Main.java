package com.adhiraj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adhiraj.beans.MyStudent;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyStudent.class);
		
		MyStudent std = (MyStudent) context.getBean("myStudent");
		/* while accessing the bean object name of bean class is provided with its first
		letter being in lower case in getBean(-) method. */
		std.display();
	}
}
