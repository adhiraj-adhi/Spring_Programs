package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.adhiraj.beans.Student;

@Configuration
public class JavaConfigFile {
	
	@Bean(name="stdObj1")
	@Scope("singleton")  
	// since by default scope is also singleton so prividing it explicitly is not mandatory
	public Student createObject1() {
		Student std = new Student();
		std.setName("Adhiraj Adhi");
		std.setRoll(101);
		
		return std;
	}
}
