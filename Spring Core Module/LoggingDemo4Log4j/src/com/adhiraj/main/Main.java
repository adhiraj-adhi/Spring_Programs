package com.adhiraj.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------- Application Starts ----------");
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+
				"/src/com/adhiraj/resources/log4j.properties");
		
		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("This is fatal message\n");
		logger.error("This is error message\n");
		logger.warn("This is warn message\n");
		logger.info("This is info message\n");

		System.out.println("---------- Application Stops ----------");
	}
}

/*
	O/P:
	---------- Application Starts ----------	
	---------- Application Stops ----------
	
	-> Since we haven't use ConsoleAppender so no logs will be printed on console 
	
	-> We will have our myLog4j.log file created with message as:
	[FATAL] 2024-01-31 02:07:28,645 This is fatal message

	[ERROR] 2024-01-31 02:07:28,646 This is error message
	
	[WARN] 2024-01-31 02:07:28,646 This is warn message
	
	[INFO] 2024-01-31 02:07:28,646 This is info message
	
	
	-> Also as the name suggest FileAppender appends the message by itself every time
	we re-run the program and we are not required to do anything explicitly as we did
	in case of Java Logging API.
	are not 

*/
