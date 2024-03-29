package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main8 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		String str_exp1 = " 'Adhiraj Adhi' matches 'Adhiraj adhi' ";
		/* matches is part of RegEx Matcher class. The matches method attempts to 
		match the entire input sequence against the pattern. */
		Expression expression1 = parser.parseExpression(str_exp1);
		
		/* Instead of matching two Strings we can compare a String with a pattern also.
		   For instance, suppose we want to check that whether a String contains only lower
		   or upper case alphabet and has size between 5 and 15 or not then we can do:
		 */
		
		String str_exp2 = " 'Adhiraj Adhi' matches '[a-zA-Z]{5,15}' ";
		Expression expression2 = parser.parseExpression(str_exp2);
		
		String str_exp3 = " 'AdhirajAdhi' matches '[a-zA-Z]{5,15}' ";
		Expression expression3 = parser.parseExpression(str_exp3);
		
		// if we want to allow space also then we can do:
		String str_exp4 = " 'Abhi Adhiraj Adhi' matches '[a-zA-Z ]{5,20}' ";
		Expression expression4 = parser.parseExpression(str_exp4);
		
		/* if we want check whether number is valid or not (i.e. whether it contains
		10 digits and is between 0 to 9 or not and */
		String str_exp5 = " '9876543210' matches '[0-9]{10}' ";
		Expression expression5 = parser.parseExpression(str_exp5);
		
		/* Suppose we want to match a normal mail (say @gmail.com) where upper and lower
		   case letters, numbers, underscore are allowed before '@gmail.com' and also
		   @gmail.com is must then we can do:
		 */
		String str_exp6 = " 'abhi123_67@gmail.com' matches '[a-zA-Z0-9_]*@gmail.com' ";
		Expression expression6 = parser.parseExpression(str_exp6);
		// The '*' before @gmail.com means that "@gmail.com" is compulsory
		
		Object obj1 = expression1.getValue();
		Object obj2 = expression2.getValue();
		Object obj3 = expression3.getValue();
		Object obj4 = expression4.getValue();
		Object obj5 = expression5.getValue();
		Object obj6 = expression6.getValue();
		
		System.out.println(obj1); 
		System.out.println(obj2);  
		System.out.println(obj3);  
		System.out.println(obj4);  
		System.out.println(obj5);   
		System.out.println(obj6);    
	}
}


/*
	O/P:
	false
	false (since here we have space also)
	true
	true
	true
	true
*/