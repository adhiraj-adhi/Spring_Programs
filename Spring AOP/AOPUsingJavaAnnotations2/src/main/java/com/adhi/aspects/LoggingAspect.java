package com.adhi.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	/*
	 * If suppose we would have wanted to add pointcuts before and after two methods 
	 * (say transactionUsingUPI() and transactionUsingInternetBanking()) then:
	 */
	
	@Before("execution(* com.adhi.services.BankingApp.transactionUsingUPI()) || "
			+ "execution(* com.adhi.services.BankingApp.transactionUsingInternetBanking())")
	public void loggerBefore() {
		System.out.println("--- Logging Service (before) ---");
	}
	
	@After("execution(* com.adhi.services.BankingApp.transactionUsingUPI()) || "
			+ "execution(* com.adhi.services.BankingApp.transactionUsingInternetBanking())")
	public void loggerAfter() {
		System.out.println("--- Logging Service (after) ---");
	}
}
