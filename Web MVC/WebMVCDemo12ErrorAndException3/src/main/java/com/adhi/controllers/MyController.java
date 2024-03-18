package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/home")
	public String openHomePage() {
		System.out.println(10/0);
		return "home";
	}
	
	/* No any handler as error page will be opened by its own based on 
	 * the <prop> tag in myDisptacherServlet-servlet.xml file
	 */
}
