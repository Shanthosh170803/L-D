package com.mph;
interface TwoWheelers{
	int noofwheels =4;
//	String fule;
//	Vehicle(){
//		System.out.println("Vehicle Constructor......");
//	}
//	public void start() {
//		System.out.println("Starting.....");
//	}
	public abstract void move(); // public void move(); also possible
}
class Bike implements TwoWheelers{

	@Override
	public void move() {
		System.out.println("Bike Moving");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		TwoWheelers tw;
		Bike b=new Bike();
		b.move();
	}

}
