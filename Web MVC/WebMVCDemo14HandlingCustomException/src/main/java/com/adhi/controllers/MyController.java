package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.adhi.exceptions.LessAgeException;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	@GetMapping("/openVotingPage")
	public String openVotingPage() {
		return "voting-page";
	}
	
	@PostMapping("/votingForm")
	public String votingForm(HttpServletRequest req) {
		int age = Integer.parseInt(req.getParameter("age"));
		
		if(age<18) {
			throw new LessAgeException("You are not eligible to vote");
		} else {
			return "success";
		}
	}
	
	@PostMapping("/openErrorPage") 
	/* we provide post type request because in real this exception is coming from post 
	 * type request handler
	 */
	public String openErrorPage() {
		return "fail";
	}
}
