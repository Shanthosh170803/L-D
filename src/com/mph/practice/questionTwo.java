package com.mph.practice;

public class questionTwo {
	int squares=81;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new questionTwo().go();
		System.out.println(new questionTwo().squares);
	}
	void go() {
		incr(++squares);
		System.out.println(squares);
	}
	void incr(int squares) {
		squares +=10;
		System.out.println(this.squares);
		
	}
}
