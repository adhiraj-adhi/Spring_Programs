package com.adhiraj.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ValidationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confPassword = req.getParameter("confPassword");
		
		// Validation Code:
		if(name.length() <= 3) {
			writer.println("<h3 style='color: red;'> Provide Valid Name </h3>");
		} else if(!email.endsWith("@gmail.com")) { 
			// i.e. if email doesn't ends with "@gmail.com"
			writer.println("<h3 style='color: red;'> Provide Valid Email </h3>");
		} else if(password.length() < 5) { 
			// i.e. if email doesn't ends with "@gmail.com"
			writer.println("<h3 style='color: red;'> Please Provide Password of "
					+ "length 5 or more characters </h3>");
		} else if(!password.equals(confPassword)) {
			writer.println("<h3 style='color: red;'> Passwords doesn't match </h3>");
		} else {
			/* if validation is successful we will use FilterChain for invoking the next 
			 * filter or resource. This can be done as:
			 */
			fc.doFilter(req, resp);
		}
	}

}
