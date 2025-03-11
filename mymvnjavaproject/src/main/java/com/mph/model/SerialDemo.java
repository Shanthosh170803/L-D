package com.mph.model;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class SerialDemo {
	public void serializeEmp(List<Employee> em) {
		try {
			FileOutputStream fos = new FileOutputStream("EmployeeSD.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//Employee emp = new Employee(11, "Siva");
			oos.writeObject(em);
			System.out.println("Serialized....");
			fos.close();//Normal Closing method
			oos.close();//Normal Closing method
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}
	public void deserializeEmp(List<Employee> em) {
			try(FileInputStream fis = new FileInputStream("EmployeeSD.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);)
			 //try with resource block fis.close() & ois.close()is automatically done                                         
			{
				
				List<Employee> em1 = (List<Employee>) ois.readObject();
				System.out.println(em1);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(NullPointerException e) {
				e.printStackTrace();
			}
	}
//	public static void main(String[] args) {
//		SerialDemo s = new SerialDemo();
//		List em = null;
//		s.serializeEmp(em);
//		s.deserializeEmp(em );
//	}
}
