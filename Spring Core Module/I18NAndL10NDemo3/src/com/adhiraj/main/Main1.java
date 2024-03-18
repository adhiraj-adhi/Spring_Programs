package com.adhiraj.main;

import java.util.Currency;
import java.util.Locale;

public class Main1 {
	public static void main(String[] args) {
		Currency currency1 = Currency.getInstance(new Locale("en","IN"));
		System.out.println(currency1);  // prints currency code.
		
		System.out.println("Currency symbol: "+currency1.getSymbol()); // O/P: Currency symbol: ₹
		System.out.println("Currency name is: "+currency1.getDisplayName());
		System.out.println(currency1.getCurrencyCode());
		
		System.out.println("===============================================");
		
		Currency currency2 = Currency.getInstance(new Locale("en","US"));
		System.out.println(currency2);  // prints currency code.
		
		System.out.println("Currency symbol: "+currency2.getSymbol()); // O/P: Currency symbol: ₹
		System.out.println("Currency name is: "+currency2.getDisplayName());
		System.out.println(currency2.getCurrencyCode());
	}
}

/*
	O/P:
	INR
	Currency symbol: ₹
	Currency name is: Indian Rupee
	INR
	==============================================================================================
	USD
	Currency symbol: $
	Currency name is: US Dollar
	USD
*/