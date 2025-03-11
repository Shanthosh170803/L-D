package com.mph.practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Forest {
	private Tree tree=new Tree();
	public static void main(String[] args) {
		Forest f=new Forest();
		try {
			FileOutputStream fs=new FileOutputStream("Forest.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(f);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Tree{
	
}