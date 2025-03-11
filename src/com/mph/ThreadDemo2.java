package com.mph;
class ThreadA1{
	public synchronized void print() {
		System.out.println("sync starts");
		try {
			for(int i=1;i<6;i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sync ends");
	}
}
class ThreadC extends Thread{
	ThreadA1 ta;
	public ThreadC(ThreadA1 ta) {
		this.ta=ta;
	}
	public void run() {
		ta.print();
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		ThreadA1 ta1=new ThreadA1();
		ThreadC tc1=new ThreadC(ta1);
		tc1.start();
		ThreadC tc2=new ThreadC(ta1);
		tc2.start();
		System.out.println("main ends");

	}

}
