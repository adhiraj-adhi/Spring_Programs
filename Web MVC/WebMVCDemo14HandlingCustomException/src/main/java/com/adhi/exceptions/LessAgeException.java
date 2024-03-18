package com.adhi.exceptions;

// This is our custom exception class
public class LessAgeException extends RuntimeException {
	public LessAgeException() {
		super();
	}
	
	public LessAgeException(String message) {
		super(message);
	}
}
