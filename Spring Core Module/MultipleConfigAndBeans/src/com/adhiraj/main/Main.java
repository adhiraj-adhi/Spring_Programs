package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Employee;
import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"/com/adhiraj/resources/studentConfig.xml",
						"/com/adhiraj/resources/employeeConfig.xml");
		
		Student std1 = (Student) context.getBean("stdObj1");
		std1.display();
		
		System.out.println("-------------------------------");
		
		Employee emp1 = (Employee) context.getBean("empObj1");
		emp1.empDisplay();
		
	}
}
