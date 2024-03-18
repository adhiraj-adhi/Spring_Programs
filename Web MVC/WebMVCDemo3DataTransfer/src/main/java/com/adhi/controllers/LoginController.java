package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	@RequestMapping("/loginPage")
	public String openLoginPage() {
		return "login";
	}
	
//	//Way 1 to send the data to the profile page (Preferred Way):
//	@PostMapping("/login")
//	public String getLoginData(HttpServletRequest req, Model model) {
//		String email = req.getParameter("email");
//		String password = req.getParameter("password");
//		
//		if(email.equals("adhiraj@gmail.com") && password.equals("adhiraj123")) {
//			// Let us suppose we got name from database and it's Adhiraj Adhi
//			String name = "Adhiraj Adhi";
//	
//			model.addAttribute("user_name", name);
//			
//			System.out.println(email+"..."+password);
//			return "profile";
//		} else {
//			model.addAttribute("login_Error", "Invalid Credentials!!!");
//			return "login";
//		}
//	}
	
	
//	//Way 2 to send the data to the profile page (Using the Constructor):
//	@PostMapping("/login")
//	public ModelAndView getLoginData(HttpServletRequest req) {
//		String email = req.getParameter("email");
//		String password = req.getParameter("password");
//		
//		 ModelAndView modelAndView = null;
//				
//		if(email.equals("adhiraj@gmail.com") && password.equals("adhiraj123")) {
//			// Let us suppose we got name from database and it's Abhinav
//			String name = "Abhinav";
//			
//			modelAndView = new ModelAndView("profile", "user_name", name);
//					
//			System.out.println(email+"..."+password);
//
//			return modelAndView;
//		} else {
//			modelAndView = 
//					new ModelAndView("login", "login_Error", "Invalid Credentials!!!");
//			return modelAndView;
//		}
//	}
	
	
	// Way 3 to send the data to the profile page:
	@PostMapping("/login")
	public ModelAndView getLoginData(HttpServletRequest req, ModelAndView modelAndView) {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("adhiraj@gmail.com") && password.equals("adhiraj123")) {
			// Let us suppose we got name from database and it's Adhiraj
			String name = "Adhiraj";
			modelAndView.addObject("user_name", name);
			modelAndView.setViewName("profile");

			
			System.out.println(email+"..."+password);
			return modelAndView;
		} else {
			modelAndView.addObject("login_Error", "Invalid Credentials!!!");
			modelAndView.setViewName("login");
			return modelAndView;
		}
	}
}
