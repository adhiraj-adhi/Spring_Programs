package com.adhiraj.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.adhiraj.beans.Student;

public class Main {
	public static void main(String[] args) {
		Resource resource = 
				new ClassPathResource("/com/adhiraj/resources/applicationContext.xml");
		// creating the Spring Container (BeanFactory):-
		BeanFactory beanFatory = new XmlBeanFactory(resource);
		// XmlBeanFactory is on the verge of deprecation.
		
		/* Here, object does not get created with the container creation. Instead an object
		is created at the time when we try to get an Object using getBean() method. */
		
		Student student1 = (Student) beanFatory.getBean("studentObj1"); 
		// In the above line, "studentObj" object will be created
		// Return type of getBean() method is Object type.
		student1.display();
		
		// using getter methods instead of display() methods:-
		System.out.println("Name Is: "+student1.getName()+" and Roll Is: "
		+student1.getRollno());
	}
}
