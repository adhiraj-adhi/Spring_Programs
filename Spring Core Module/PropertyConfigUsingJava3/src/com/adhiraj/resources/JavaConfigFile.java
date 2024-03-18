package com.adhiraj.resources;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("C", 87);
		map.put("C++", 78);
		map.put("Java", 97);
		map.put("Python", 92);
		
		std.setSubAndMarks(map);
		
		return std;
	}
}
