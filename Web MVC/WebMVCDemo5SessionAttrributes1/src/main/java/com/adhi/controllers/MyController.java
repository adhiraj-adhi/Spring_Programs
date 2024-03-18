package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
// Storing data in @SessionAttributes:
@SessionAttributes("nameOfUser")
/* We could have provided "username" directly in @SessionAttributes as 
 * SessionAttributes("username") but it is not preferred. We create Model and then 
 * store it as we did here.
 */
public class MyController {
	
	@GetMapping("/aaa")
	public String openFirstPage(Model model) {
		/*
		 * Now, suppose here we want to store some data (say username) in 
		 * session that can be used by openSecondPage() handler then:
		 */
		String username = "Adhiraj";
		/*
		 * The general use case of this approach is that suppose we are required to 
		 * use some specific data (which we got after running 100 lines of code) in 
		 * some other handler than instead of writing those 100 lines of code again 
		 * why not store it using @SessionAttrributes. 
		 */
		model.addAttribute("nameOfUser", username);
		
		return "first";
	}
	
	@GetMapping("/bbb")
	public String openSecondPage() {
		/* We can use the set SessionAttributes (i.e. nameOfUser) here also but 
		 * before opening this page it is must that openFirstPage() handler has 
		 * been executed or else our SessionAttributes wouldn't get set.
		 */
		return "second";
	}
}
