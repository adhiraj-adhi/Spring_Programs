package com.adhi.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.adhi.aspects.LoggingAspect;
import com.adhi.aspects.SecurityAspect;
import com.adhi.services.BankingApp;
import com.adhi.services.BankingApp2;

@Configuration
@EnableAspectJAutoProxy
/*
 * @EnableAspectJAutoProxy:- It enables support for handling components marked
 * with AspectJ's @Aspect annotation
 */
public class SpringConfigFile {
	// Creating bean for BankingApp
	@Bean
	public BankingApp bankingApp() {
		return new BankingApp();
	}

	// Creating bean for BankingApp2
	@Bean
	public BankingApp2 bankingApp2() {
		return new BankingApp2();
	}

	// Creating bean for LoggingAspect
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}

	// Creating bean for SecurityAspect
	@Bean
	public SecurityAspect securityAspect() {
		return new SecurityAspect();
	}
}
