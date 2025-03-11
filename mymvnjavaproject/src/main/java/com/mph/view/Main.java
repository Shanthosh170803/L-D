package com.mph.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
//import com.mph.model.Employee;
import com.mph.exception.UserNotFoundException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		try {
			Scanner sc=new Scanner(System.in);
//			System.out.println("Welcome"); 
			String un=null,pwd=null;
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Enter user");
			un=br.readLine();
			System.out.println("Enter password");
			pwd=br.readLine();
			
			BiPredicate<String,String> p=(user,pass)->
			 user.equals("Shanthosh") && pass.equals("1708");
			if(p.test(un,pwd))
			 {
				System.out.println("Welcome "+un);
			
			EmployeeController ec=new EmployeeController();
			String ch=null;
			do {
				System.out.println("Enter your choice:");
				System.out.println("1)Add Employee");
				System.out.println("2)View Employee");
				System.out.println("3)Add Employee in array");
				System.out.println("4)To Print is sorted order By Employee number:");
				System.out.println("5)To Print is sorted order By Employee name:");
				System.out.println("6)Serialize Employee");
				System.out.println("7)Deserialize Employee");
				System.out.println("8)ResultSetMetaData");
				System.out.println("9)DatabaseMetaData");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					ec.addEmp();
					break;
				case 2:
					ec.viewEmp();
					break;
				case 3:
					ec.addEmptoArray();
					break;
				case 4:
					ec.sortArrayByEmpno();
					break;
				case 5:
					ec.sortArrayByEname();
					break;
				case 6:
					ec.serialize();
					break;
				case 7:
					ec.deserialize();
					break;
				case 8:
					ec.RSMetaData();
					break;
				case 9:
					ec.DBMetaData();
					break;
				default:
					System.out.println("Enter right choice");
				}
				System.out.println("Do you want to continue? Y / y");
				ch=sc.next();
			}while(ch.equals("Y") | ch.equals("y"));
			}else {
				throw new UserNotFoundException();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
