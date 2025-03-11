package com.mph.practice;
class A{
	void foo()throws Exception{
		throw new Exception();
	}
}
class subB2 extends A{
	void foo() {
		System.out.println("B");
	}
}
public class Tester {

	public static void main(String[] args) {
		A a=new SubB2();
		a.foo();

	}

}
