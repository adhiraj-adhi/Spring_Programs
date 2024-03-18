package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main5 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression1 = parser.parseExpression("(10<20) && (10 eq 10)");
		Expression expression2 = parser.parseExpression("((10/2) == 5) OR (10 gt 20)");
		Expression expression3 = parser.parseExpression("(10 lt 20) ? 'It is true' : 'It is false'");
		Object obj1 = expression1.getValue();
		Object obj2 = expression2.getValue();
		Object obj3 = expression3.getValue();
		System.out.println(obj1);   // O/P: true
		System.out.println(obj2);   // O/P: true
		System.out.println(obj3);   // O/P: It is true
	}
}
