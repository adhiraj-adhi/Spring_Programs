package com.adhi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhi.services.BankingApp;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
		new ClassPathXmlApplicationContext("/com/adhi/resources/applicationContext.xml");
		
		BankingApp bankingApp = (BankingApp) context.getBean("proxyId");
		// Note that here we are getting the proxy object from container
		bankingApp.doTransactionUsingUPI();
		System.out.println();
		bankingApp.doTransactionUsingInternetBanking();
		System.out.println();
		bankingApp.doTransactionUsingWallet();
	}
}
