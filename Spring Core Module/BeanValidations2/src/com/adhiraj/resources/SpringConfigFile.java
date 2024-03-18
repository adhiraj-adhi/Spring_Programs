package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adhiraj.beans.Student;
import com.adhiraj.validators.StudentValidators;

@Configuration
public class SpringConfigFile {
	@Bean("stdValidator")
	public StudentValidators createStdValidator() {
		return new StudentValidators();
	}
	
	/* If we would have been using XML config file then we would have done:
	 <bean class="com.adhiraj.validators.StudentValidators" id="stdValidator" />
	*/
	
	
	@Bean("stdObj")
	public Student createStd() {
		Student std = new Student();
		std.setName("Adhiraj");
		std.setRoll(101);
		std.setPhoneno("1234");		
		return std;
	}
}
