package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main4 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression1 = parser.parseExpression("10>20");
		Expression expression2 = parser.parseExpression("10 lt 20");  
		// lt - less than
		Object obj1 = expression1.getValue();
		Object obj2 = expression2.getValue();
		System.out.println(obj1);   // O/P: false
		System.out.println(obj2);   // O/P: true
	}
}
