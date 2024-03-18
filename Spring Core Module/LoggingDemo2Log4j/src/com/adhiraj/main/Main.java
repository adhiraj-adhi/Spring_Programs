package com.adhiraj.main;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------- Application Starts ----------");
		
		BasicConfigurator.configure();
		/*
		  If we do not add the line "BasicConfigurator.configure();" 
		  then we will get O/P as:
		  ---------- Application Starts ----------
		  log4j:WARN No appenders could be found for logger (Main).
		  ---------- Application Stops ----------
		  log4j:WARN Please initialize the log4j system properly.
		  
		  -> The above line sets up the basic configurations for using Logger of Log4j

		*/
		
		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		Thread.currentThread().setName("adhiraj");
		logger.warn("This is warn message");
		logger.info("This is info message");

		System.out.println("---------- Application Stops ----------");
	}
}

/*
	O/P:
	---------- Application Starts ----------
	0 [main] FATAL Main  - This is fatal message
	1 [main] ERROR Main  - This is error message
	1 [adhiraj] WARN Main  - This is warn message
	1 [adhiraj] INFO Main  - This is info message
	---------- Application Stops ----------
	
	-> In the O/P above [main], and [adhiraj] is the name of Thread.
*/
