package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		// setting value:
		context.setAttribute("myName", "Adhiraj Adhi");
		
		// getting value:
		String name = (String) context.getAttribute("myName");
		// similarly, we can get value in other servlets also
		
		PrintWriter writer = resp.getWriter();
		writer.println("Name: "+name);
	}
}
