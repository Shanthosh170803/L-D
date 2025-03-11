package com.mph.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowDemo {

	public static void main(String[] args) throws IOException {
		try {
			String un=null,pwd=null;
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Enter user");
			un=br.readLine();
			System.out.println("Enter password");
			pwd=br.readLine();
			if(un.equals("Shanthosh")&&pwd.equals("123")) {
				
			}else {
				throw new UserNotFoundException("Wrong username/password");
			}
		}catch(UserNotFoundException e) {
			e.printStackTrace();
			//System.out.println(e);
		}finally {
			System.out.println("UNF finally...");
		}

	}

}
