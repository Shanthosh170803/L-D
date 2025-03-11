package com.mph.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import com.mph.Employee;

interface Calculate{
	public int add(int a,int b);
}
//class Employee{
//	int i;
//	String name;
//	public Employee(int i,String name) {
//		this.i=i;
//		this.name=name;
//		
//	}
//	@Override
//	public String toString() {
//		return "Employee [i=" + i + ", name=" + name + "]";
//	}
//}
public class LamdaEg {

	public static void main(String[] args) {
		Calculate res=(a,b)->{return a+b;};//lamda function syntax 
		System.out.println(res.add(10, 10));
		
		Runnable r=() -> {
			Task t=new Task();
			t.show();
		};
		Thread th=new Thread(r);
		th.start();
		
		//java 8 -2
		Thread t1=new Thread(() -> {
			Task t=new Task();
			t.show();
		});
		t1.start();
		
		//Java 8 - 3
		new Thread(() -> {
			Task t=new Task();
			t.show();
		}).start();
		
		//java 8 -4
		new Thread(() ->{
			new Task().show();
		}).start();
		
		// java 8 -5
		new Thread(new Task()::show).start();
		
		Employee e1=new Employee(1,"ram");
		Employee e2=new Employee(2,"siva");
		Employee e3=new Employee(3,"ali");
		
		List elist=Arrays.asList(e1,e2,e3);
		System.out.println(elist);
		elist.forEach(li->System.out.println(li));
		
		BiPredicate<String,String> p=(un,pw)->un.equals("abc") && pw.equals("pass");
		if(p.test("abc", "pass")) {
			System.out.println("OK");
		}else {
			System.out.println("Not Ok");
		}
		
		Supplier<String> s=()->{
			return "shanthosh";
		};
		
		System.out.println(s.get());
		
		Function<Integer, String> res1 =(num)->{
			if(num%2==0) {
				return "even";
			}else {
				return "odd";
			}
		};
		System.out.println(res1.apply(17));
	}
}
//IN JAVA 7
//public class LamdaEg implements Calculate{
//	public staic void main(String[] args) {
//		LamdaEg lm=new LamdaEg();
//		System.out.println(lm.add(10,10));
//	}
//	public int add(int a,int b) {
//		return a+b;
//	}
//}