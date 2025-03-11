package com.mph.java8;

import java.util.regex.Pattern;

public class RegexEmailValidation {

	public static void main(String[] args) {
		String email="shanthosh170803@gmail.com";
		String emailPattern="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
		boolean isValid=Pattern.matches(emailPattern,email);
		System.out.println(isValid);

	}

}
