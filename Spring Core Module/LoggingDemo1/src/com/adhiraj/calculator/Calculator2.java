package com.adhiraj.calculator;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Logger logger = Logger.getLogger("Calculator");
		FileHandler fileHandler = null;
		try {
			fileHandler = new FileHandler("D://myLogs.log", true);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fileHandler.setFormatter(simpleFormatter);
		
		logger.addHandler(fileHandler);
		
		boolean continueCalc = false;
		do {
			logger.log(Level.INFO, "====================================");
			System.out.println("Enter Number 1:");
			int numb1 = scanner.nextInt();
			logger.log(Level.INFO, "Number 1 provided by user is: "+numb1);
			
			System.out.println("Enter Number 2:");
			int numb2 = scanner.nextInt();
			logger.log(Level.INFO, "Number 2 provided by user is: "+numb2);
			
			System.out.println("Select Operation (+, -, *, /)");		
			String operation = scanner.next();
			logger.log(Level.INFO, "Operation selected by user is: "+operation);
			
			int result;
			switch (operation) {
			case "+": 
				result = numb1 + numb2;
				System.out.println("Addition is: "+result);
				logger.log(Level.INFO, "Addition is: "+result);
				break;
			case "-": 
				result = numb1 - numb2;
				System.out.println("Subtraction is: "+result);
				logger.log(Level.INFO, "Subtraction is: "+result);
				break;
			case "*": 
				result = numb1 * numb2;
				System.out.println("Multiplication is: "+result);
				logger.log(Level.INFO, "Multiplication is: "+result);
				break;
			case "/": 
				if(numb2 == 0) {
					logger.log(Level.SEVERE, "Cannot divide by zero");
				} else {
					result = numb1 / numb2;
					System.out.println("Division is: "+result);
					logger.log(Level.INFO, "Division is: "+result);
				}
				break;
			default:
				System.out.println("Invalid Operation");
				logger.log(Level.INFO, "Invalid Operation");
			}
			System.out.println("If you want to continue operation press y or Y "
					+ "else press any key to exit");
			String key = scanner.next();
			continueCalc = key.equalsIgnoreCase("y") ? true : false;
		} 
		while(continueCalc);
		System.out.println("Exit success");
	}
}

