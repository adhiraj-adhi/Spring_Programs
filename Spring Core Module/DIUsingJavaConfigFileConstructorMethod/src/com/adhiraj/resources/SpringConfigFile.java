package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adhiraj.beans.Address;
import com.adhiraj.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() {
		return new Address(123, "Delhi", 12345);
	}
	
	@Bean(name="stdObj1")
	public Student createStdObj1() {
		return new Student("Abhinav", 1, createAddrObj1());
	}
	
	
	/* Instead of creating two separate function as above we can do as follows also:
	@Bean(name="stdObj1")
	public Student createStdObj1() {
		Address addr = new Address(123, "Delhi", 12345);
		Student std = new Student("Abhinav", 1, addr);
		return std;
	}
	*/
}
