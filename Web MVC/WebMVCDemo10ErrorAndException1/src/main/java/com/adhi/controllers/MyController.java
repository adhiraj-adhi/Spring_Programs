package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String openHomePage() {
		return "home";
	}
	
	// Handling URL corresponding to error code 404
	@GetMapping("/pageNotFound")
	public String openPageNotFound() {
		return "page-not-found";
	}
}