package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("session_name");
		
		writer.println("<a href='"+resp.encodeURL("home")+"'> Home </a>");
		writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
		writer.println("<a href='"+resp.encodeURL("profile")+"'> Profile </a>");
		writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
		writer.println("<a href='"+resp.encodeURL("contact")+"'> Contact Us </a>");
		writer.print("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
		writer.println("<a href='"+resp.encodeURL("contact")+"'> Logout </a>");
		
		writer.println("<h4 style='color: green;'> Hello "+name+"...  </h4>");
		writer.println("<h3> This is Home page </h3>");
	}
	
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
