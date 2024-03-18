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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		/* It is to be noted that we are forwarding the request from doPost() method
		 * in Login.java servlet so here it is required to use doPost() method 
		 * instead of doGet() method else we will get error saying: "HTTP method POST 
		 * is not supported by this URL"
		 */
		PrintWriter writer = resp.getWriter();
		
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("session_name");
		
		writer.println("<h4 style='color: green;'> Hello "+name+"...  </h4>");
		writer.println("<a href='logout'> Logout </a>");
	}
}
