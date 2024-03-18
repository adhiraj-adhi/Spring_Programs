package com.adhiraj.resources;

import java.util.ArrayList;
import java.util.List;

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
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add("Java");
		list.add("Python");
		std.setSubjects(list);
		
		return std;	
	}
}
