package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main7 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		String str_exp1 = " 'Adhiraj Adhi'.length() ";
		Expression expression1 = parser.parseExpression(str_exp1);
		String str_exp2 = " 'Adhiraj Adhi'.toUpperCase() ";
		Expression expression2 = parser.parseExpression(str_exp2);
		Object obj1 = expression1.getValue();
		Object obj2 = expression2.getValue();
		System.out.println(obj1); 
		System.out.println(obj2);   
	}
}


/*
	O/P:
	12
	ADHIRAJ ADHI
*/