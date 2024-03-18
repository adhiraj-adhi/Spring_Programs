package com.adhiraj.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main9 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		// static method invocation:
		String str_exp1 = "T(com.adhiraj.main.Main9).addition(10,20)";
		Expression expression1 = parser.parseExpression(str_exp1);
		System.out.println(expression1.getValue());	
		/* Here, "null" will be returned by "expression1.getValue()" and printed by
		   "System.out.println(expression1.getValue())" as the return type of 
		   addition(int, int) method is void 
		*/
		
		System.out.println("======================");
		// instance method invocation
		String str_exp2 = "new com.adhiraj.main.Main9().subtraction(10,20)";
		Expression expression2 = parser.parseExpression(str_exp2);
		Object obj = expression2.getValue();
		/* we can type cast above to integer type as:
		   int value = (int) expression2.getValue();
		   OR, as:
		   int value = expression2.getValue(Integer.class);
		*/
		System.out.println("Subtraction is: "+obj);	
	}
	
	
	public static void addition(int a, int b) {
		System.out.println("Addition is: "+(a+b));
	}
	
	public int subtraction(int a, int b) {
		return b-a;
	}
}


/*
	O/P:
	Addition is: 30
	null
	======================
	Subtraction is: 10
*/