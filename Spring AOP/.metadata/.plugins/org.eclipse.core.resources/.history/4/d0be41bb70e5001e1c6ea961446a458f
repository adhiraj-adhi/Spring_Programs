package com.adhi.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	/*
	 * We want this to execute before all the methods of BankingApp2 but only before 
	 * transactionUsingUPI() of BankingApp class
	 * */
	@Before("execution(* com.adhi.services.BankingApp.transactionUsingUPI()) || "
			+ "execution(* com.adhi.services.BankingApp2.transactionUsingWallet2())")
	public void logger() {
		System.out.println("--- Logging Service ---");
	}
}
