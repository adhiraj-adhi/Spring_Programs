package com.adhiraj.main;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("=================================");
		// Suppose we want to print date in "dd/MM/yyyy" format then:
		String pattern1 = "dd/MM/yyyy";  
		// "MM" should be in upper case while "dd" or "yyyy" can be either in upper or lower case.
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
		System.out.println(sdf1.format(date));
		
		System.out.println("=================================");
		// Suppose we want to print date in "dd/MonthName(3 letters)/yyyy" format then:
		String pattern2 = "dd/MMM/yyyy";
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
		System.out.println(sdf2.format(date));
		
		System.out.println("=================================");
		// Suppose we want to print date in "dd/MMM/Last 2 digit of year" format then:
		String pattern3 = "dd/MMM/yy";
		SimpleDateFormat sdf3 = new SimpleDateFormat(pattern3);
		System.out.println(sdf3.format(date));
		
		System.out.println("=================================");
		// Suppose we want to print time as well as date then:
		String pattern4 = "dd/MMM/yyyy HH:mm:ss";
		// HH -> 24 hr format
		// mm -> minutes
		// ss -> seconds
		SimpleDateFormat sdf4 = new SimpleDateFormat(pattern4);
		System.out.println(sdf4.format(date));
		
		System.out.println("=================================");
		// Suppose we want to print time in 12Hr format then:
		String pattern5 = "dd/MMM/yyyy hh:mm:ss aa";
		// hh -> 12 hr format
		// aa -> For A.M. and P.M.
		SimpleDateFormat sdf5 = new SimpleDateFormat(pattern5);
		System.out.println(sdf5.format(date));
	}
}

/*
	O/P:
	Thu Jan 25 23:50:47 IST 2024
	=================================
	25/01/2024
	=================================
	25/Jan/2024
	=================================
	25/Jan/24
	=================================
	25/Jan/2024 23:50:47
	=================================
	25/Jan/2024 11:50:47 pm
*/