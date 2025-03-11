package com.mph;

class Emp{
	int eno=101;
	String ename="S";
	Emp(){
		System.out.println("emp const");
	}
	Emp(int eno){
		this(104,"Shalini");
		this.eno=eno;
		System.out.println("m.emp const");
	}
	Emp(int eno,String ename){
		this.eno=eno;
		this.ename=ename;
		System.out.println("m.emp const");
	}
	public String getEmpDetails() {
		return eno+" "+ename;
	}
	public void showId() {
		// TODO Auto-generated method stub
		
	}
}
class Manager extends Emp{
	String dept="IT";
	
	public Manager() {
		super(555);
		System.out.println("Manager const");
	}
	public String getEmpDetails() { // Overridden methods
		//return eno+" "+ename +" "+dept;
		return super.getEmpDetails()+" "+dept;
	}
}
public class MainClass {

	public static void main(String[] args) {
		Emp e=new Emp();
	//	System.out.println(e.getEmpDetails());
		
		Manager m=new Manager();
	//	System.out.println(m.getEmpDetails());
		
		Emp e1=new Manager();
	//	System.out.println(e1.getEmpDetails());
		e1.showId();
		if(m instanceof Emp) {
			System.out.println("Employee");
		}
		else {
			System.out.println("Manager");
		}
		Manager m1=(Manager)new Emp();
		System.out.println(m1.getEmpDetails());
		
	}
}
