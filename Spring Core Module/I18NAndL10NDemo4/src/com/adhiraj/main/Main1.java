package com.adhiraj.main;

import java.text.DateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Main1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("==============================");
		System.out.println("\nBelow is the date format according to India");
		DateFormat format1 = DateFormat.getDateInstance(0, new Locale("en", "IN"));
		/*
			=> getDateInstance(int style, Locale aLocale): Gets the date formatter with the 
			   given formatting style for the given locale.
			=> Parameters:
			   (i) style- the given formatting style. For example,SHORT for "M/d/yy" 
			       in the US locale.
			   (ii) aLocale- the given locale.
		*/
		System.out.println(format1.format(date));
		
		System.out.println("==============================");
		System.out.println("\nBelow is the date format according to USA");
		DateFormat format2 = DateFormat.getDateInstance(0, new Locale("en", "US"));
		System.out.println(format2.format(date));
		
		System.out.println("==============================");
		System.out.println("\nBelow is the date format according to Japan");
		DateFormat format3 = DateFormat.getDateInstance(0, new Locale("", "JP"));
		System.out.println(format3.format(date));
		
		System.out.println("==============================");
		System.out.println("\nBelow is the date format according to France");
		DateFormat format4 = DateFormat.getDateInstance(0, new Locale("fr", "FR"));
		System.out.println(format4.format(date));
		
	}
}

/*
	O/P:
	Thu Jan 25 23:39:07 IST 2024
	==============================
	
	Below is the date format according to India
	Thursday, 25 January, 2024
	==============================
	
	Below is the date format according to USA
	Thursday, January 25, 2024
	==============================
	
	Below is the date format according to Japan
	2024 Jan 25, Thu
	==============================
	
	Below is the date format according to France
	jeudi 25 janvier 2024
*/