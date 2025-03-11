package com.mph.practice;
class Money{
	private String country="canada";
	public String getC(){
		return country;
	}
}
class Yen extends Money{
	public String getC() {
		// return super.country; not possible because of country is private
		return super.getC();
	}
	
}

public class Euro extends Money {

	public static void main(String[] args) {
		
		System.out.println(new Yen().getC()+" "+new Euro().getC());
	}

}
