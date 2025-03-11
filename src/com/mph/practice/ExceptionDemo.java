package com.mph.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Fourth{
	public void divide(){
		try {
			int x=0,y=0,z=0;
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter x");
			x=Integer.parseInt(br.readLine());
			System.out.println("Enter y");
			y=Integer.parseInt(br.readLine());
			z=x/y;
			System.out.println(z);
			System.out.println("End");
		}catch (ArithmeticException e) {
			System.out.println("Dont divide by zero");
		}catch(NumberFormatException e) {
			System.out.println("Dont divide by character");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Fifth extends Fourth {
	public void divide() {
		try {
			int x=0,y=0,z=0;
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter x");
			x=Integer.parseInt(br.readLine());
			System.out.println("Enter y");
			y=Integer.parseInt(br.readLine());
			z=x/y;
			System.out.println(z);
			System.out.println("End");
		}
//		catch (ArithmeticException e) {
//			System.out.println("Dont divide by zero");
//		}
		catch(NumberFormatException e) {
			System.out.println("Dont divide by character");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			Fourth obj=new Fourth();
			obj.divide();
		}catch(Exception e) {
			System.out.println(e);
		}
}
}
