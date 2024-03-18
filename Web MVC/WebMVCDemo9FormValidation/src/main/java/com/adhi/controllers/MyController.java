package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adhi.beans.Student;

import jakarta.validation.Valid;

@Controller
public class MyController {
	
	@GetMapping("/register")
	public String openRegisterPage(Model model) {
		model.addAttribute("studentModel", new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerFormHandler(@Valid @ModelAttribute("studentModel")
		Student std, BindingResult bindingResult) {	
		/* Instead of "studentDetails" we provided "studentModel" in @ModelAttribute
		 * because name of attribute set for Student object passed in the
		 * openRegisterPage() using Model is "studentModel"
		 */
		if(bindingResult.hasErrors()) {
			return "register";
		} else {
			System.out.println(std.getName()+"..."+std.getEmail()+"..."
					+std.getGender()+"..."+std.getCity());
			return "profile";
		}
	}
}
