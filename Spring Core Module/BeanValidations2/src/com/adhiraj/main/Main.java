package com.adhiraj.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.adhiraj.beans.Student;
import com.adhiraj.resources.SpringConfigFile;
import com.adhiraj.validators.StudentValidators;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = (Student) context.getBean("stdObj");
		
		Map<String, Object> map = new HashMap<String, Object>();
		MapBindingResult mapBindingResult = new MapBindingResult(map, "customName");
		/*
			In MapBindingResult(Map, String) we provide a Map in which error will be stored and a customName for that Map.
		*/
		
		StudentValidators sdtValidator = (StudentValidators) context.getBean("stdValidator");
		sdtValidator.validate(std, mapBindingResult); 
		// after the above line all errors will be stored in "MapBindingResult mapBindingResult"
		// validate(Object target, Errors errors)
		
		// We can get all the errors from "MapBindingResult mapBindingResult" as:
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
