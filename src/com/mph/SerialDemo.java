package com.mph;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SerialDemo {
	public void serializeEmp() {
		try {
			FileOutputStream fos = new FileOutputStream("Myfile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(11, "Siva");
			oos.writeObject(emp);
			System.out.println("Serialized....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void deserializeEmp() {
			try {
				FileInputStream fis = new FileInputStream("Myfile.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Employee em = (Employee) ois.readObject();
				System.out.println(em.getEmpno() + " " + em.getEname());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		SerialDemo s = new SerialDemo();
		s.serializeEmp();
		//s.deserializeEmp();
	}
}
