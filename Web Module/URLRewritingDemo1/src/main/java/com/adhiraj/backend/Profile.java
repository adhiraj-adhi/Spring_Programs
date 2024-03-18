package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class Profile extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("session_name");
		
//		writer.println("<a href='home'> Home </a>");
		writer.println("<a href='"+resp.encodeURL("home")+"'> Home </a>");
		writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
		writer.println("<a href='"+resp.encodeURL("profile")+"'> Profile </a>");
		writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
		writer.println("<a href='"+resp.encodeURL("contact")+"'> Contact Us </a>");
		writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
		writer.println("<a href='"+resp.encodeURL("contact")+"'> Logout </a>");
		
		writer.println("<h3 style='color: green;'> Hello "+name+"...  </h3>");
		writer.println("<h3> This is Profile page </h3>");
	}
	
	/*
	 * Here, we are providing both doGet() and doPost() method since in the case
	 * of request being forwarded from Login.java servlet the doPost() method will
	 * execute but when we will click on Profile hyperlink in navbar a get request
	 * will be fired.
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		service(req, resp);
	}
}
