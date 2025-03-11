package com.mph;
class Common{
	int num;
	boolean available=false;
	
	public synchronized int put(int n) {
		if(available)
			try {
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		this.num=n;
		System.out.println("Put--"+num);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.available=true;
		notify();
		return num;
	}
	public synchronized int get() {
		if(!available) 
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Get--"+num);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		this.available=false;
		notify();
		return num;
	}
}
class Producer extends Thread{
	Common c;
	public Producer(Common c) {
		this.c=c;
		new Thread(this, "Producer ").start();
	}
	public void run() {
		int i=0;
		while(i<10) {
			c.put(i++);
			
		}
	}
}
class Consumer extends Thread{
	Common c;
	public Consumer(Common c) {
		this.c=c;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		int i=0;
		while(i<10) {
			c.get();
			i++;
		}
	}
}
public class ProdConsDemo {
	
	public static void main(String[] args) {
		Common c=new Common();
		new Producer(c);
		new Consumer(c);
	}

}
