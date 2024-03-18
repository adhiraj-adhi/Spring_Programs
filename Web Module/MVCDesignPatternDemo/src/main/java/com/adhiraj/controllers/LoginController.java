package com.adhiraj.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import com.adhiraj.model.User;
import com.adhiraj.service.LoginService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		LoginService logService = new LoginService();
		User user = logService.loginService(email, password);
		
		if(user!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("session_user", user);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp");
			dispatcher.forward(req, resp);
		} else {
			writer.println("<h4 style='color: red;'>Invalid credentials</h4>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.include(req, resp);
		}
	}
}
