package com.mph.practice;
class Payload{
	private int weight;
	public Payload (int w) {
		weight =w;
	}
	public void setWeight(int w) {
		weight=w;
	}
	public String toString() {
		return Integer.toString(weight);
	}
}
public class TestPayload {
	static void changePayload(Payload p) {
		p.setWeight(420); //420 ans
		//p.changePayload(420); // error
		//p=new Payload(420); //1024
		//Payload.setWeight(420); // error
	}
	public static void main(String[] args) {
		Payload p=new Payload(200);
		p.setWeight(1024);
		changePayload(p);
		System.out.println(p);

	}

}
