package com.mph.controller;

import com.mph.dao.EmployeeData;
import com.mph.model.Employee;
import com.mph.model.Salary1;
import com.mph.model.Salary2;
import com.mph.model.SerialDemo;

import java.util.*;

public class EmployeeController {

	Employee emp;
	Salary1 sal1;
	Salary2 sal2;
	SerialDemo sd=new SerialDemo();
	EmployeeData dao = new EmployeeData();
	Scanner sc = new Scanner(System.in);
	List<Employee> emplist=new ArrayList<Employee>();
	public void addEmp() {
		emp = new Employee();
		sal1 = new Salary1();
		sal2 = new Salary2();
		System.out.println("Enter Empno: ");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter Empname: ");
		String ename = sc.next();
		emp.setEname(ename);

		System.out.println("Enter Employee Type:");
		System.out.println("1)Full Time");
		System.out.println("2)Part Time");
		int type = sc.nextInt();
		switch(type) {
		case 1:
			System.out.println("Enter Basic Salary:");
			int basic = sc.nextInt();
			sal1.setBasic(basic);
			sal1.setHra();
			sal1.setPf();
			sal1.setGross();
			sal1.setNet();
			emp.setEtype("Fulltime");
			emp.setType(type);
			emp.setSal1(sal1);
			dao.createEmp(emp);
			System.out.println("Employee Added...");
			break;
		case 2:
			System.out.println("Enter Salary:");
			int basic1 =sc.nextInt();
			sal2.setBasic(basic1);
			emp.setEtype("Parttime");
			System.out.println("Working hours per day:");
			int hrs=sc.nextInt();
			sal2.setHrs(hrs);
			System.out.println("Enter working days per week:");
			int days=sc.nextInt();
			sal2.setDays(days);
			sal2.setDaywages();
			sal2.setHrswages();
			emp.setSal2(sal2);
			emp.setType(type);
			dao.createEmp(emp);
			System.out.println("Employee Added...");
			break;
		default:
			System.out.println("Enter right choice");
		}
		emplist.add(emp);
	}
	public void sortArrayByEname() {
		Collections.sort(emplist,Employee.nameComparator);
		Iterator i=emplist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	public void sortArrayByEmpno() {
//		Collections.sort(emplist);
//		Iterator i=emplist.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		Collections.sort(emplist,(empno1,empno2)->empno1.getEmpno()-empno2.getEmpno());
		emplist.forEach(emp->System.out.println(emp));
		
	}
	public void addEmptoArray() {
		System.out.println("Enter the array size:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			addEmp();
			arr[i] = emp.getEmpno() + " -- " + emp.getEname();
		}
		System.out.println(Arrays.toString(arr));
	}
	public void viewEmp() {
//		Iterator i=emplist.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		//emplist.forEach(emp-> System.out.println(emp));
		emplist.forEach(System.out::println);
		dao.showEmp();
	}
	public void serialize() {
		sd.serializeEmp(emplist);
	}
	public void deserialize() {
		sd.deserializeEmp(emplist);
	}
	public void RSMetaData() {
		dao.resultSetMetaData();
	}
	public void DBMetaData() {
		dao.databaseMetaData();
	}
}