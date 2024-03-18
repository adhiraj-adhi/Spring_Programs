package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
		
		Student std1 = (Student) context.getBean("stdObj1");
		std1.display();
	}
}


/*
	O/P:
	Name: Adhiraj Adhi
	Roll: 19
	Address: #123, Delhi - 12345
	Subjects: [C, C++, Java]
*/