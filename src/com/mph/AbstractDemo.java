package com.mph;
abstract class Vehicle{
	int noofwheels =4;
	String fule;
	Vehicle(){
		System.out.println("Vehicle Constructor......");
	}
	public void start() {
		System.out.println("Starting.....");
	}
	public void move(){
		
	};
}

class Bus extends Vehicle{

	@Override
	public void move() {
		System.out.println("Bus Moving");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// Vehicle v=new Vehicle (); -> Not possible 
		Vehicle v;
		Bus b=new Bus();
		b.start();
		b.move();
	}

}
