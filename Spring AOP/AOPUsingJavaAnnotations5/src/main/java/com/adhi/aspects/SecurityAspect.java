package com.adhi.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {
	@Before("execution(* com.adhi.services.BankingApp.*(..))")
	public void securityAspect() {
		System.out.println("--- Security Service ---");
	}
}
