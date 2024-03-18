package com.adhi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adhi.services.BankingApp;

public class Main 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("/com/adhi/resources/applicationContext.xml");
       BankingApp ba = (BankingApp) context.getBean("bankingAppId");
       ba.transactionUsingUPI();
       System.out.println();
       ba.transactionUsingInternetBanking();
       System.out.println();
       ba.transactionUsingMobileBanking();
       System.out.println();
       ba.transactionUsingWallet();
    }
}
