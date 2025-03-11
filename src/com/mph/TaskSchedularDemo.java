package com.mph;
class Task extends Thread{
	String taskname;
	public Task(String taskname,int priority) {
		this.taskname=taskname;
		setPriority(priority);
	}
	public void run() {
		System.out.println("Task "+taskname+" Started with "+getPriority()+" priority");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Completed");
	}
}
public class TaskSchedularDemo {

	public static void main(String[] args) {
		Task t1=new Task("Task 1",Thread.MAX_PRIORITY);
		Task t2=new Task("Task 2",Thread.MIN_PRIORITY);
		Task t3=new Task("Task 3",Thread.NORM_PRIORITY);
		t1.start();t2.start();t3.start();
	}



}
