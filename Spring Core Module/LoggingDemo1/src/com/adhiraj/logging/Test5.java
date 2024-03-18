package com.adhiraj.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("main() method starts");
		Logger logger = Logger.getLogger("Test2");
		logger.setLevel(Level.WARNING);
		
		logger.log(Level.SEVERE, "main() method severe method");
		logger.log(Level.WARNING, "main() method warning message");
		logger.log(Level.INFO, "main() method info message");
		
		
		System.out.println("main() method ends");
	}
}

/*
O/P:
	main() method starts
	Jan 30, 2024 2:06:59 AM com.adhiraj.logging.Test5 main
	SEVERE: main() method severe method
	Jan 30, 2024 2:06:59 AM com.adhiraj.logging.Test5 main
	WARNING: main() method warning message
	main() method ends
*/
