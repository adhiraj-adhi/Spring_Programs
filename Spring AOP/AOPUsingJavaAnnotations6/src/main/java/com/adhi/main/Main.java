package com.adhi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adhi.resources.SpringConfigFile;
import com.adhi.services.BankingApp;
import com.adhi.services.BankingApp2;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		BankingApp ba = (BankingApp) context.getBean(BankingApp.class);

		ba.transactionUsingUPI();
		System.out.println();
		ba.transactionUsingInternetBanking();
		System.out.println();
		ba.transactionUsingMobileBanking();
		System.out.println();
		ba.transactionUsingWallet();
		System.out.println();

		System.out.println("===================================");
		BankingApp2 ba2 = (BankingApp2) context.getBean(BankingApp2.class);
		ba2.transactionUsingWallet2();
	}
}