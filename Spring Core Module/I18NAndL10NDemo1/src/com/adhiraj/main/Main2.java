package com.adhiraj.main;

import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		
		// let's try Locale for some other locations say "France".
		
		// (Way1) Using Constructor:
//		Locale locale2 = new Locale("fr","FR"); 
		
		// (Way2) we can use setDefault(Locale newLocale) method as:
		Locale.setDefault(new Locale("fr","FR"));
		Locale locale2 = Locale.getDefault();
		
		/* constructors are deprecated so we can even use country's name defined 
		as static variable in Locale*/
//		Locale locale2 = Locale.FRANCE;
		
		System.out.println(locale2);  // O/P: en_IN -> en for English and IN for India
		System.out.println("Country Code is: "+locale2.getCountry());
		System.out.println("Country Name is: "+locale2.getDisplayCountry());
		System.out.println("Language Code is: "+locale2.getLanguage());
		System.out.println("Language Name is: "+locale2.getDisplayLanguage());
	}
}

/*
	O/P: 
	fr_FR
	Country Code is: FR
	Country Name is: France
	Language Code is: fr
	Language Name is: French
*/
