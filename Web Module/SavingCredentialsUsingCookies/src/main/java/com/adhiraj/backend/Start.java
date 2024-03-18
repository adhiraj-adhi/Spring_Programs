package com.adhiraj.backend;

import java.io.IOException;
import java.util.Iterator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/start")
// If we simply provide @WebServlet("/") then we get StackOverflowError. Do not know Why?
public class Start extends HttpServlet {
	/*
	 * First this servlet will run and if the login cookie is not present then we
	 * will go to login page else if it's present then we will go to profile page
	 */
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		boolean loginStatus = false;
		Cookie[] cookies = req.getCookies();
		/*
		 * During the very first time of launching application their may be chance that
		 * cookie is not present so first we will check whether "cookies" is null or not.
		 */
		System.out.println("kxjs");
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("login_status") && cookie.getValue().equals("true")) {
					System.out.println("ghjhj");
					loginStatus = true;
					break;
				}
			}
		}
		
		if(loginStatus) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/profile");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
			dispatcher.forward(req, resp);
		}
		
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
