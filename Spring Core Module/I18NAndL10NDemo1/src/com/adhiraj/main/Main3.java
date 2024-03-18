package com.adhiraj.main;

import java.util.Locale;

public class Main3 {
	public static void main(String[] args) {
		String[] countryCode_arr = Locale.getISOCountries();
		
		for(String countryCode : countryCode_arr) {
			Locale locale = new Locale("",countryCode); 
			/* we are providing language as empty string; we can not provide null 
			   instead of empty string else we will get NullPointerException
			 */
			System.out.println(""
					+ "Country name is: "+locale.getDisplayCountry()+" and code is: "
					+countryCode);
			/* we can not get language here by using locale.getDisplayLanguage() 
			   as we have not set the language
			 */
		}
		
		// to get the languages we can do as:		
		System.out.println("=====================================================");
		String[] languageCode_arr = Locale.getISOLanguages();
		for(String languageCode : languageCode_arr) {
			Locale locale = new Locale(languageCode);
			System.out.println(""
			+ "Language code is: "+languageCode+" and language is: "+locale.getDisplayLanguage());
		}
	}
}

/*
	O/P:
	Country name is: Andorra and code is: AD
	Country name is: United Arab Emirates and code is: AE
	Country name is: Afghanistan and code is: AF
	Country name is: Antigua & Barbuda and code is: AG
	Country name is: Anguilla and code is: AI
	Country name is: Albania and code is: AL
	Country name is: Armenia and code is: AM
	Country name is: Angola and code is: AO
	Country name is: Antarctica and code is: AQ
	.....
	.....
	.....
	=====================================================
	Language code is: aa and language is: Afar
	Language code is: ab and language is: Abkhazian
	Language code is: ae and language is: Avestan
	Language code is: af and language is: Afrikaans
	Language code is: ak and language is: Akan
	Language code is: am and language is: Amharic
	Language code is: an and language is: Aragonese
	Language code is: ar and language is: Arabic
	Language code is: as and language is: Assamese
	Language code is: av and language is: Avaric
	Language code is: ay and language is: Aymara
	Language code is: az and language is: Azerbaijani
	Language code is: ba and language is: Bashkir
	Language code is: be and language is: Belarusian
	Language code is: bg and language is: Bulgarian
	Language code is: bh and language is: Bihari
	.....
	.....
	.....
*/