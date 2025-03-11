package com.mph.practice;

public class Mud {

	public static void main(String[] args) {
		for(String s: args) {
			System.out.println(s);
		}
		for(int i=0;i<=10;i++) {
			if(i>6) break;	
		}
		System.out.println(i);
	}
}
