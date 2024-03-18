package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login-form")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("adhiraj@gmail.com") && password.equals("Adhiraj123")) {
			resp.setContentType("text/html");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome.html");
			dispatcher.forward(req, resp);
			/*
			  -> If suppose we were to forward request to a Servlet with 
			     '@WebServlet("/aaa")' then:
			     RequestDispatcher dispatcher = req.getRequestDispatcher("/aaa");
			     dispatcher.forward(req, resp);
			*/
			
			/*
			  -> NOTE: Even though request is forwarded to some other component but 
			  	 the URL will remain unchanged. For instance, here even though if 
			  	 request was forwarded to Servlet with '@WebServlet("/aaa")' then also 
			  	 URL would have been same as "localhost:8080/ServletCommunication1/login-form".
			  
			  -> In include(), content is just included so there's no any change of URL.
			*/
		} else {
			PrintWriter writer = resp.getWriter();
			writer.println("<h4 style='color: red'>Incorrect email or password</h4>");
			resp.setContentType("text/html");
			// If we do not set content type then we will get HTML code instead of the form
			RequestDispatcher dispatcher = req.getRequestDispatcher("/index.html");
			dispatcher.include(req, resp);
		}
	}
}
