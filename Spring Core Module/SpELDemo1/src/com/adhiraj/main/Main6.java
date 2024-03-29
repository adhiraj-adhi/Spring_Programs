package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main6 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression1 = parser.parseExpression("T(java.lang.String)");
		Expression expression2 = parser.parseExpression("T(org.springframework.expression.Expression)");
		Object obj1 = expression1.getValue();
		Object obj2 = expression2.getValue();
		System.out.println(obj1); 
		System.out.println(obj2);   
	}
}


/*
	O/P:
	class java.lang.String
	interface org.springframework.expression.Expression
*/