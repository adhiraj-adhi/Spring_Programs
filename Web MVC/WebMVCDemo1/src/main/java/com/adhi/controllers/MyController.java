package com.adhi.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
		HttpServletResponse response) throws Exception {
		
		/* To Create ModelAndView Object:
			ModelAndView modelAndView = new ModelAndView();
		*/
		
		/* To specify the View that this Controller will return
		 * we can either use the setView() method or simply we can use the constructor
		 * ModelAndView(String vireName)
		 */
		ModelAndView modelAndView = new ModelAndView("hello");
		
		/* If we want to add data then we can use 
		 * modelAndView.addObject(String attributeName, Object attributeValue)
		 */
		
		return modelAndView;
	}

}
