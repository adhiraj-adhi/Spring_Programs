package com.adhiraj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		// creating the Spring container (ApplicationContext):-
		ApplicationContext applicationContext = 
		new ClassPathXmlApplicationContext("/com/adhiraj/resources/applicationContext.xml");
/*		Unlike BeanFactory here all the objects is created after the container creation 
 * 		is successful
 */
		
		Student student1 = (Student) applicationContext.getBean("studentObj1");
		student1.display();
		
	}
}
