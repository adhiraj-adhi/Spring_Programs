package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String openHomePage() {
		System.out.println(10/0);
		return "home";
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException() {
		return "error-page";
	}
}
