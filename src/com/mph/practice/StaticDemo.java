package com.mph.practice;
class First{
	int x=30;
	static int y=40;
	static class InnerClass{
		public static int dummy() {
			return 7;
		}
	}
	
	class RgInerClass{
		
	}
	public void regularMethod() {
		System.out.println("x "+ ++x);
		System.out.println("y "+ ++y);
	}
	public static void staticMethod() {
		//System.out.println("x"+x);
		//System.out.println("static y "+ y);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		First s1=new First();
		
		First.RgInerClass rg = s1.new RgInerClass();
		s1.regularMethod();
		First s2=new First();
		s2.regularMethod();
		//First.InnerClass fc = new First.InnerClass();
		System.out.println(new First.InnerClass().dummy());
	}

}
