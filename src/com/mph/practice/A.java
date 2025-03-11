package com.mph.practice;

public class A {
	public void doit() {
		
	}
	public String doit() {//parameter should be different in method overloading so it shows the error 
		return "a";
	}
	public double doit(int x) {
		return 1.0;
	}
}
