package com.adhiraj.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main1 {
	public static void main(String[] args) {
		Locale locale1 = new Locale("en","US");
		ResourceBundle resourcebundle1 = ResourceBundle.getBundle("com/adhiraj/resources/MessageBundle",locale1);
		String message1 = resourcebundle1.getString("key_greet");
		// Prototype of getString() method:- public String getString(String key)
		System.out.println(message1);
		
		System.out.println("==============================");
		
		Locale locale2 = new Locale("hi","IN");
		ResourceBundle resourcebundle2 = ResourceBundle.getBundle("com/adhiraj/resources/MessageBundle",locale2);
		String message2 = resourcebundle2.getString("key_greet");
		System.out.println(message2);
	}
}