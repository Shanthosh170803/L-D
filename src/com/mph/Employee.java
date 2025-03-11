package com.mph;

import java.io.Serializable;
import java.util.*;


public class Employee implements Serializable {
	private transient int empno;
	private String ename;
//	Employee(){
//		System.out.println("From Non parameterized constructor");
//	}
	public Employee(int empno,String ename){
		this.empno=empno;
		this.ename=ename;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEmpno(int empno) {
		this.empno=empno;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	@Override
	public String toString() {
		return  "empno=" + empno + ", ename=" + ename ;
	}

	
}
