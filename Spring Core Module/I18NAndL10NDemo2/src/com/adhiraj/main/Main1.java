package com.adhiraj.main;

import java.text.NumberFormat;
import java.util.Locale;

public class Main1 {
	public static void main(String[] args) {
		int numb1 = 123456789;
		double numb2 = 9876543.1225;
		
		Locale locale = new Locale("en", "IN");
		/* Or, since our JVM is configured for India so we can do: 
			Locale locale = Locale.getDefault();  
		*/
		
		NumberFormat format1 = NumberFormat.getInstance(locale);
		
		/*
		(i) getInstance(): Returns a general-purpose number format for the current 
		default FORMAT locale.
		(ii) getInstance(Locale inlocale): Returns a general-purpose number format for the 
		specified locale.
		*/
		
		System.out.println(format1.format(numb1));
		System.out.println(format1.format(numb2)); 
		// three digits only after decimal will be printed
		
		// Similarly, we can print for other countries as well.
	}
}

/*
O/P:
123,456,789
9,876,543.123
*/
