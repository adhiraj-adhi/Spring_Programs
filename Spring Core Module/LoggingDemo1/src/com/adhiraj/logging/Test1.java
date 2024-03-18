package com.adhiraj.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
	public static void main(String[] args) {
		
		/* 
		 We can get Logger object using getLogger(String name) factory method.
		 In the argument of getLogger() method we provide the name of Logger 
		 which is generally a dot-separated name and should normally be based on 
		 the package name or class name of the subsystem, such as java.netor, javax.swing class 
		*/
		Logger logger = Logger.getLogger("Test1");
		
		// providing the level and message of logger
		logger.log(Level.SEVERE, "This is very-very important message");
	}
}

/*
 * O/P Format:
   Date & Time fullyQualifiedPackageName methodName
   Level: Message
 * */

/*
	O/P of above program:
	Jan 30, 2024 12:53:46 AM com.adhiraj.logging.Test1 main
	SEVERE: This is very-very important message
*/
