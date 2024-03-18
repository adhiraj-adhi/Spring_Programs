package com.adhiraj.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.adhiraj.beans.Student;
import com.adhiraj.validators.StudentValidators;

public class Main {
	public static void main(String[] args) {
		String configLocation = "/com/adhiraj/resources/applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		Student std = (Student) context.getBean("stdObj");
		
		Map<String, Object> map = new HashMap<String, Object>();
		MapBindingResult mapBindingResult = new MapBindingResult(map, "anyName");
		
		StudentValidators stdValidators = (StudentValidators) context.getBean("stdValidators");
		stdValidators.validate(std, mapBindingResult);
		List<ObjectError> errors = mapBindingResult.getAllErrors();
		
		if(errors.isEmpty()) {
			// logic part
			std.display();
		} else {
			for(ObjectError oe : errors) {
				System.err.println(oe.getDefaultMessage());
			}
		}
	}
}
