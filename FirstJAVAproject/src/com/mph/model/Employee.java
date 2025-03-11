package com.mph.model;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable <Employee>, Serializable{
	private int empno;
	private String ename;
	private Salary sal;
	private Salary1 sal1;
	private Salary2 sal2;
	private int type;
	private String etype;

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public Salary1 getSal1() {
		return sal1;
	}
	public void setSal1(Salary1 sal1) {
		this.sal1 = sal1;
	}
	public Salary2 getSal2() {
		return sal2;
	}
	public void setSal2(Salary2 sal2) {
		this.sal2 = sal2;
	}
	
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}

	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}
		@Override
	public String toString() {
		if(type==1) {
			return "Employee [empno=" + empno + ", ename=" + ename +", etype="+ etype + ", sal1=" + sal1 +"]";
		}else if (type ==2) {
			return "Employee [empno=" + empno + ", ename=" + ename +", etype="+ etype + ", sal2=" + sal2 +"]";
		}
		return "";
	}
	@Override
	public int compareTo(Employee e1) {
		
		return this.empno -e1.empno;
	}
//	public static Comparator<Employee> nameComparator =new Comparator <Employee>() {
//		public int compare(Employee e1,Employee e2) {
//			return e1.getEname().compareTo(e2.getEname());
//		}
//	};
	public static Comparator<Employee> nameComparator=Comparator.comparing(Employee::getEname);
}
