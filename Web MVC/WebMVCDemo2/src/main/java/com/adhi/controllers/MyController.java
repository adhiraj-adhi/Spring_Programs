package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
//	@RequestMapping("/abc")
//	public ModelAndView openHelloPage() {
//		ModelAndView modelAndView = new ModelAndView("hello");
//		return modelAndView;
//	}
	
	// OR,
	
	@RequestMapping("/abc")
	public String openHelloPage() {
		return "hello";
	}
}
