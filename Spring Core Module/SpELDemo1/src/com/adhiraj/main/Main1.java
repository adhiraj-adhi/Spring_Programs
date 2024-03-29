package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main1 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression expression = parser.parseExpression("'Hello World'");
		// for parsing String (i.e. literal expression) we use single quotes (i.e. '')
		
		/*
		parseExpression(String expression):
		-> It parses an expression. Parsing an expression in an expression language 
		refers to the process of analyzing an expression and evaluating it to 
		produce a result. In layman's term it's analysizing whether the expression 
		that it is error free or not.
		-> Return type is Expression
		*/
		
		// We will not evaluate the expression as:
		Object obj = expression.getValue();  
		// we could have even type-casted to String here.
		
		System.out.println(obj);  // O/P: Hello World
	}
}
