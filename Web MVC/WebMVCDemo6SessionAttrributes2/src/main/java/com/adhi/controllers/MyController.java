package com.adhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
// Storing data in @SessionAttributes:
@SessionAttributes("nameOfUser")
public class MyController {
	
	@GetMapping("/aaa")
	public String openFirstPage(Model model) {
		String username = "Adhiraj";
		model.addAttribute("nameOfUser", username);
		return "first";
	}
	
	@GetMapping("/bbb")
	public String openSecondPage() {
		return "second";
	}
	

	/* If suppose that after openThirdPage() we want that SessionAttributes is 
	 * inaccessible (i.e. emptied) then we can use SessionStatus interface as: 
	 */
	@GetMapping("/ccc")
	public String openThirdPage(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		/* After this our SessionAttributes will be emptied and cannot be used 
		 * further. Now, until and unless our openFirstPage() doesn't run
		 * and set the data again we will be not able to access the SessionAttributes 
		 * in any of the handlers.
		 * 
		 * NOTE: Before emptying the SessionAttributes the data set in it is accessible
		 * by all the handlers defined here.
		 */
		return "third";
	}
	

	@GetMapping("/ddd")
	public String openFourthPage() {
		return "fourth";
	}
}
