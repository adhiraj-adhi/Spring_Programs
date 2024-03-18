package com.adhiraj.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/error")
public class SendErrorMethod extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.sendError(404, "Page Not Found (This is custom message)");
	}
}

/*
O/P:

HTTP Status 404 – Not Found
-----------------------------

Type Status Report

Message Page Not Found (This is custom message)

Description The origin server did not find a current representation 
	for the target resource or is not willing to disclose that one exists.
--------------------------------------------------------------------------

Apache Tomcat/10.1.15
*/