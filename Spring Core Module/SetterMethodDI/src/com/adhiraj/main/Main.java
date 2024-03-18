package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdObj");
		
		std.display();
	}
}


/**
 * O/P (If we do not override toString() method in Address class):
 * Name: Adhiraj
 * Roll: 12
 * Address: com.adhiraj.beans.Address@33c7353a
 * 
 * 
 * O/P (If we override toString() method in Address class):
 * Name: Adhiraj
 * Roll: 12
 * Address: #12 Delhi - 12344
 * 
 * */
