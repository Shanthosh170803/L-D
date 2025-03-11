package com.mph.practice;

import java.util.TreeSet;


public class Drinks {
	public class Drink implements Comparable{
		public String name;
		public int compareTo(Object o) {
			return 0;
		}
	}
	public static void main(String[] args) {
		Drink one=new Drink();
		Drink two=new Drink();
		one.name="coffee";
		two.name="tea";
		TreeSet set=new TreeSet();
		set.add(one);
		set.add(two);
		System.out.println(set.toString());
	}

}
