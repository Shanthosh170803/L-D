package com.mph.practice;

public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		pass p=new pass();
		p.doStuff(x);
		System.out.println("main x ="+x);
	}
	void doStuff(int x) {
		System.out.println("doStuff x="+ x++);
	}
}
