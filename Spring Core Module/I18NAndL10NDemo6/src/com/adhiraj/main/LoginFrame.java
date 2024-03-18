package com.adhiraj.main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame {
	static Locale locale;
	public LoginFrame(String key_login_title, String key_email_title, String key_pass_title, String key_login_btn) {
		JFrame jf = new JFrame();
		jf.setSize(500, 550);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null); // so that by default layout becomes null
		
		JLabel jl_login_title = new JLabel(key_login_title);
		jl_login_title.setBounds(200, 50, 100, 30);
		jf.add(jl_login_title);
		
		JLabel jl_email_title = new JLabel(key_email_title);
		jl_email_title.setBounds(40, 140, 100, 30);
		jf.add(jl_email_title);
		
		JTextField jt_email = new JTextField();
		jt_email.setBounds(40, 180, 300, 40);
		jf.add(jt_email);
		
		
		JLabel jl_password_title = new JLabel(key_pass_title);
		jl_password_title.setBounds(40, 240, 100, 30);
		jf.add(jl_password_title);
		
		JPasswordField jp_password = new JPasswordField();
		jp_password.setBounds(40, 280, 300, 40);
		jf.add(jp_password);
		
		JButton jb_login = new JButton(key_login_btn);
		jb_login.setBounds(200, 350, 100, 30);
		jf.add(jb_login);
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your language:");
		System.out.println("1. English - US");
		System.out.println("2. Hindi - INDIA");
		System.out.println("==========================");
		int number = scanner.nextInt();
		
		switch(number) {
			case 1:
				locale = new Locale("en", "US");				
			break;
			case 2:
				locale = new Locale("hi", "IN");			
			break;
			default: System.out.println("Choose valid language");
		}
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("com/adhiraj/resources/MessageBundle", locale);
		String key_login_title = resourceBundle.getString("key_login_title");
		String key_email_title = resourceBundle.getString("key_email_title");
		String key_pass_title = resourceBundle.getString("key_pass_title");
		String key_login_btn = resourceBundle.getString("key_login_btn");
		
		new LoginFrame(key_login_title, key_email_title, key_pass_title, key_login_btn);
	}
}
