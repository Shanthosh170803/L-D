package com.mph.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String regex="\\d+";
		String input="the price is 250";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher =pattern.matcher(input);
		while(matcher.find()){
			System.out.println("found :"+ matcher.group());
		}

	}

}
