package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
			urlPatterns = {"/servlet1", "/myservlet"},
			// Firing both the URL patterns will execute this servlet
			initParams = {
					@WebInitParam(name="myName", value="Adhiraj"),
					@WebInitParam(name="myEmail", value="adhiraj@gmail.com")
			}
		)
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// Getting ServletConfig object:
		ServletConfig config = getServletConfig();
		
		// Getting value from ServletConfig object
		String name = config.getInitParameter("myName");
		String email = config.getInitParameter("myEmail");
		
		PrintWriter writer = resp.getWriter();
		writer.println("Name: "+name);
		writer.println("Email: "+email);		
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
