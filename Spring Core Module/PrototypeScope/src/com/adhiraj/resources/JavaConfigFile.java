package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.adhiraj.beans.Student;

@Configuration
public class JavaConfigFile {
	
	@Bean(name="stdObj1")
	@Scope("prototype")
	public Student createObject1() {
		Student std = new Student();
		std.setName("Adhiraj Adhi");
		std.setRoll(101);
		
		return std;
	}
}
