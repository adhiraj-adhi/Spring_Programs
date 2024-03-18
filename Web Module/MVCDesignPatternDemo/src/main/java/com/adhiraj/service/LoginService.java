package com.adhiraj.service;

import com.adhiraj.dao.LoginDAO;
import com.adhiraj.model.User;

public class LoginService {
	public User loginService(String email, String password) {
		LoginDAO logDAO = new LoginDAO();
		User user = logDAO.loginDAO(email, password);
		
		return user;
	}
}
