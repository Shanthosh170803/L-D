package com.mph.practice;

public class TestDemo {
	static void test() {
		try {
			String x=null;
			System.out.println(x.toString());
		}finally {
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		}catch(Exception ex) {
			System.out.println("exception");
		}
	}

}
