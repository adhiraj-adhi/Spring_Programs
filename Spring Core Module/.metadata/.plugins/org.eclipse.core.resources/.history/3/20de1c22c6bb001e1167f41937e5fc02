package com.adhiraj.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class Student {
	private String name;
	private String country;
	private MessageSource messageSource;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void display() {
		Locale locale = new Locale("en","US");
		String message = messageSource.getMessage("key_message", new Object[] {name, country}, locale);
		System.out.println(message);
	}
}
