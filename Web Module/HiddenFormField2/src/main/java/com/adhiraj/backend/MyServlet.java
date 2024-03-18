package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		String pageName = req.getParameter("pageName");
		
		if(pageName.equals("home")) {
			// Home page related code
			writer.println("Request came from HOME page");
		} else if(pageName.equals("profile")) {
			// Profile page related code
			writer.println("Request came from PROFILE page");
		}
	}
}
