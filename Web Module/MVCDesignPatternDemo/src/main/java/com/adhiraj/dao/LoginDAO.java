package com.adhiraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.adhiraj.model.User;
import com.adhiraj.dbcon.DbConnection;

public class LoginDAO {
	public User loginDAO(String email, String password) {
		User user = null;
		
		Connection con = DbConnection.getConnection();  
		/* 
		 * No need to handle exception for Connection part as we already handled it 
		 * in DbConnection class.
		 */
		if(con!=null) {
			try {
				PreparedStatement preparedStatement = con.prepareStatement("select * from "
						+ "register where email=? AND password=?");
				preparedStatement.setString(1, email);
				preparedStatement.setString(2, password);
				
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					user = new User();
					
					user.setName(resultSet.getString("name"));
					user.setEmail(resultSet.getString("email"));
					user.setCity(resultSet.getString("city"));
					/* We know that we should use columnIndex instead of columnName
					 * in getString() method. But, for time being we have used
					 * columnName here.
					 * Also, since here we are using MySQL and JDBC so do not
					 * forget to include mysql connector jar file.
					 */
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			// Process to be done if DB connection is failed
		}
		
		return user;
	}
}
