package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.adhiraj.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean(name = "stdObj")
	public Student createStdObj1() {
		Student std = new Student();
		ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
		rbms.setBasename("com/adhiraj/resources/MessageBundle");
		
		std.setMessageSource(rbms);
		std.setName("Abhinav");
		std.setCountry("Japan");
		return std;
	}
}
