package com.adhiraj.main;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		int numb1 = 123456789;
		double numb2 = 9876543.2134;
		
		NumberFormat format1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		System.out.println(format1.format(numb1));
		System.out.println(format1.format(numb2));
	}
}

/*
	O/P:
	₹123,456,789.00
	₹9,876,543.21
*/