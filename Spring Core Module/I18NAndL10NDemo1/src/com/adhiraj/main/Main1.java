package com.adhiraj.main;

import java.util.Locale;

public class Main1 {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();  
		/*
		 * getDefault: Gets the current value of the default locale for this 
		 * instanceof the Java Virtual Machine. 
		 * The Java Virtual Machine sets the default locale during start up based on the 
		 * host environment. It is used by many locale-sensitive methods if no locale is 
		 * explicitly specified.It can be changed using the setDefault method.
		 * */
		
		System.out.println(locale);  // O/P: en_IN -> en for English and IN for India
		System.out.println("Country Code is: "+locale.getCountry());
		System.out.println("Country Name is: "+locale.getDisplayCountry());
		System.out.println("Language Code is: "+locale.getLanguage());
		System.out.println("Language Name is: "+locale.getDisplayLanguage());
	}
}

/*
	O/P: 
	en_IN
	Country Code is: IN
	Country Name is: India
	Language Code is: en
	Language Name is: English
*/
