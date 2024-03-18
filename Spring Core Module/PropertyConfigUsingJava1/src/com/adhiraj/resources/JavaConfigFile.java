package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adhiraj.beans.Student;

@Configuration
public class JavaConfigFile {
	@Bean(name = "stdObj")
	public Student createStdObj1() {
		Student std = new Student();
		std.setName("Abhinav Yishu");
		std.setRoll(1);
		
		return std;	
	}
}
