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
	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<title>Log4J Log Messages</title>
	<style type="text/css">
	<!--
	body, table {font-family: arial,sans-serif; font-size: x-small;}
	th {background: #336699; color: #FFFFFF; text-align: left;}
	-->
	</style>
	</head>
	<body bgcolor="#FFFFFF" topmargin="6" leftmargin="6">
	<hr size="1" noshade>
	Log session start time Wed Jan 31 02:18:16 IST 2024<br>
	<br>
	<table cellspacing="0" cellpadding="4" border="1" bordercolor="#224466" width="100%">
	<tr>
	<th>Time</th>
	<th>Thread</th>
	<th>Level</th>
	<th>Category</th>
	<th>Message</th>
	</tr>
	
	<tr>
	<td>0</td>
	<td title="main thread">main</td>
	<td title="Level"><font color="#993300"><strong>FATAL</strong></font></td>
	<td title="Main category">Main</td>
	<td title="Message">This is fatal message
	</td>
	</tr>
	
	<tr>
	<td>1</td>
	<td title="main thread">main</td>
	<td title="Level"><font color="#993300"><strong>ERROR</strong></font></td>
	<td title="Main category">Main</td>
	<td title="Message">This is error message
	</td>
	</tr>
	
	<tr>
	<td>1</td>
	<td title="main thread">main</td>
	<td title="Level"><font color="#993300"><strong>WARN</strong></font></td>
	<td title="Main category">Main</td>
	<td title="Message">This is warn message
	</td>
	</tr>
	
	<tr>
	<td>1</td>
	<td title="main thread">main</td>
	<td title="Level">INFO</td>
	<td title="Main category">Main</td>
	<td title="Message">This is info message
	</td>
	</tr>
	---------- Application Stops ----------

*/