package com.mph.practice;

public class Super {
	private int a;
	protected Super(int a) {
		this.a=a;
	}
}
class Sub extends Super{
	public Sub(int a) {
		super(a);
	}
	public Sub() {
		//this.a=5;
		this(5);
		//super(5);
	}
}
