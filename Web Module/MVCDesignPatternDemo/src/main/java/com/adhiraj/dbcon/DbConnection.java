package com.adhiraj.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVC_DB", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return con;
	}
}
