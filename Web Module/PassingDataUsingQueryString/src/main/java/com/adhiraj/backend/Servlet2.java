package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		String name = req.getParameter("myname");
		String gender = req.getParameter("gender");
		writer.println("<p style='color: blue;'> Name: "+name+"<p/>");
		writer.println("<p style='color: blue;'> Gender: "+gender+"<p/>");
		
		writer.println("<h3 style='color:green;'> This is Servlet 2 </h3>");
		writer.println("<a href='servlet1'> Click Here </a> to go to Servlet 1");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		service(req, resp);
	}
}
