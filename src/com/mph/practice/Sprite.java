package com.mph.practice;
interface Foo{
	int bar();
}
public class Sprite {
	public int fubar(Foo foo) {
		return foo.bar();
	}
	public void testFoo() {
		fubar(new Foo(){public int bar() {return 1;}});
	}
}
