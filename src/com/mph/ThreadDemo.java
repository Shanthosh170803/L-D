package com.mph;
class ThreadA extends Thread{
	public synchronized void print1_5() {
		System.out.println("Sync Started");
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sync end");
	}
	public void run() {
		System.out.println("Run started in ThreadA");
		for(int i=1;i<=5;i++)
			System.out.println(i);
		System.out.println("Run Ends in ThreadA");
	}
}
class ThreadB implements Runnable{
	public void run() {
		System.out.println("Run Started in ThreadB");
		try {
			Thread.sleep(1000);
			for(int i=1;i<6;i++) {
				System.out.println(i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Run ends in ThreadB");
	}

}
public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main start");
		ThreadA ta=new ThreadA();
		ThreadB tb=new ThreadB();
		Thread t=new Thread(tb);
		//t.run(); // -> normal for extends
		ta.start(); // -> thread
		//t.start();// -> normal for implements
		System.out.println("Main ends");

	}

}
