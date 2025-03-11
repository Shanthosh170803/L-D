package com.mph.practice;

import java.util.Arrays;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException() {
		System.out.println("UNF constr....");
	}
	public UserNotFoundException(String message) {
		super(message);
		System.out.println("UNF "+message);
	}
//	@Override
//	public String toString() {
//		return "UserNotFoundException toString";
//	}
//	
}
