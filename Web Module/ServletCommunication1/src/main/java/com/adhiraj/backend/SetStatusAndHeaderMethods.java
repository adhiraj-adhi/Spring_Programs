package com.adhiraj.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/commun")
public class SetStatusAndHeaderMethods extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setStatus(HttpServletResponse.SC_FOUND);
		/*
		 * Instead of "resp.setStatus(HttpServletResponse.SC_FOUND);" we can
		 * even provide the corresponding code(For HttpServletResponse.SC_FOUND code
		 * is 302. Click on HttpServletResponse.SC_FOUND to see the code in Eclipse):
		 * resp.setStatus(302);
		 */
		
		resp.setHeader("Location", "https://www.google.com");
	}
}

/*
After "/commun" is hit we will be redirected to the location "https://www.google.com".
*/
