package com.adhiraj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adhiraj.beans.Address;
import com.adhiraj.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() {
		Address addr = new Address();
		addr.setHouseNo(123);
		addr.setCity("Delhi");
		addr.setPinCode(54321);
		
		return addr;
	}
	
	
	@Bean(name="stdObj1")
	public Student createStdObj1() {
		Student std = new Student();
		std.setName("Abhinav");
		std.setRoll(1);
		std.setAddress(createAddrObj1());
		return std;
	}
}
