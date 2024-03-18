package com.adhiraj.validators;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.adhiraj.beans.Student;

public class StudentValidators implements Validator {
	
	private Resource resource;
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		boolean supportsValidation = Student.class.equals(clazz);
		return supportsValidation;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student std = (Student) target;
		
		
		// loading properties file:
		Properties properties = null;
		
		try {
			properties = PropertiesLoaderUtils.loadProperties(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// validations and reading error from properties file:
		if(std.getName().equals("") || std.getName().equals(null)) {
			errors.rejectValue("name", "key_name", properties.getProperty("name_error"));
		}
		if(std.getRoll() <= 0) {
			errors.rejectValue("roll", "key_roll", properties.getProperty("roll_error"));
		}
		if(std.getPhoneno().length() != 10) {
			errors.rejectValue("phoneno", "key_phoneno", properties.getProperty("phoneno_error"));
		}
	}

}
