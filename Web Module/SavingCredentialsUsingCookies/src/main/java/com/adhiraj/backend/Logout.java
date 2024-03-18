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

@WebServlet("/logout")
public class Logout extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			/*
			 * Checking if there exist any cookie or not before trying to delete it.
			 */
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("login_status") && cookie.getValue().equals("true")) {
					cookie.setMaxAge(0);
					resp.addCookie(cookie);
				}
			}
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
		dispatcher.forward(req, resp);
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
