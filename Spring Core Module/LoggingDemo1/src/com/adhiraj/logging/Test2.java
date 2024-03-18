package com.adhiraj.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {
	static Logger logger;
	public void m1() {
		System.out.println("m1() method starts");
		
		logger.log(Level.SEVERE, "m1() method severe method");
		logger.log(Level.WARNING, "m1() method warning message");
		logger.log(Level.INFO, "m1() method info message");
		
		System.out.println("m1() method ends");
	}
	public static void main(String[] args) {
		System.out.println("main() method starts");
		logger = Logger.getLogger("Test2");
		
		Test2 t2 = new Test2();
		t2.m1();
		
		logger.log(Level.SEVERE, "main() method severe method");
		logger.log(Level.WARNING, "main() method warning message");
		logger.log(Level.INFO, "main() method info message");
		
		
		System.out.println("main() method ends");
	}
}

/*
O/P:
	main() method starts
	m1() method starts
	Jan 30, 2024 1:01:22 AM com.adhiraj.logging.Test2 m1
	SEVERE: m1() method severe method
	Jan 30, 2024 1:01:22 AM com.adhiraj.logging.Test2 m1
	WARNING: m1() method warning message
	Jan 30, 2024 1:01:22 AM com.adhiraj.logging.Test2 m1
	INFO: m1() method info message
	m1() method ends
	Jan 30, 2024 1:01:22 AM com.adhiraj.logging.Test2 main
	SEVERE: main() method severe method
	Jan 30, 2024 1:01:22 AM com.adhiraj.logging.Test2 main
	WARNING: main() method warning message
	Jan 30, 2024 1:01:22 AM com.adhiraj.logging.Test2 main
	INFO: main() method info message
	main() method ends
*/
