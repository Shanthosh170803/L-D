package com.mph.exception;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		System.out.println("UNF constr....");
	}
	public UserNotFoundException(String message) {
		super(message);
		System.out.println("UNF "+message);
	}
	
}
