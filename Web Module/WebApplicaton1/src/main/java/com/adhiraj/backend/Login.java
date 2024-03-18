package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("adhiraj@gmail.com") && password.equals("Adhiraj123")) {
			String name = "Adhiraj"; // this name we will get from database.
			
			// Getting session object and setting the name as attribute in it.
			HttpSession session = req.getSession();
			session.setAttribute("session_name", name);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/profile");
			dispatcher.forward(req, resp);
		} else {
			writer.println("<h4 style='color: red'> Incorrect Email or Password </h4>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.include(req, resp);
		}
	}
}
