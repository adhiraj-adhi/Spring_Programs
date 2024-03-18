package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adhiraj.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Student stdObj1() {
		/* 	since we have not provided name of bean manually here so the name of method
			will be considered as bean name.
		*/
		Student std = new Student();
		std.setName("Adhiraj");
		std.setMarks(95);
		
		return std;
	}
	
	
	@Bean(name = "stdObj2")
	public Student createBean2() {
		// Here, name of bean is stdObj2 and method name is createBean2
		Student std = new Student();
		std.setName("Abhinav");
		std.setMarks(92);
		
		return std;
	}
}
