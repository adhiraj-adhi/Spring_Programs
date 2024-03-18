package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String rememberMe = req.getParameter("rememberMe"); 
		// if not checked rememberMe is "null" else it's "on".
		
		if(email.equals("adhiraj@gmail.com") && password.equals("Adhiraj")) {
			if(rememberMe != null) {
				Cookie cookie = new Cookie("login_status", "true");
				cookie.setMaxAge(60*60*24*2);  // setting max age of two days
				resp.addCookie(cookie);
			}

			RequestDispatcher dispatcher = req.getRequestDispatcher("/profile");
			dispatcher.forward(req, resp);
		} else {
			writer.println("<h3 style='color: red;'> Invalid email or password </h3>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.include(req, resp);
		}
	}
}
