package com.adhiraj.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Test extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		
		// 1. To get keys and corresponding values of all header data:
		Enumeration<String> Keys = req.getHeaderNames();
		writer.println("<table>");
		writer.println("<thead>");
		writer.println("<td>Key</td>");
		writer.println("<td>Value</td>");
		writer.println("</thead>");
		while(Keys.hasMoreElements()) {
			String key = Keys.nextElement();
			writer.println("<tr>");
			writer.println("<td>"+key+"</td>");
			writer.println("<td>"+req.getHeader(key)+"</td>");
			writer.println("</tr>");
		}
		writer.println("</table>");
		
		writer.println("</body>");
		writer.println("</html>");
	}
}
