package com.mph.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream7 {

	public static void main(String[] args) {
		List<String> strlist=Arrays.asList("Rat","Cat","Mat","","Lion","Elephant","Tiger");
		System.out.println(strlist);
		long count=countStrlength(strlist);
		System.out.println("count="+count);
		
		List<String> slist=getAllStrWithLength(strlist);
		System.out.println("String :"+slist);

	}
	private static List<String> getAllStrWithLength(List<String> list){
		List<String> ans=new ArrayList();
		for(String str:list) {
			if(str.length()==3) {
				ans.add(str);
			}
		}
		return ans;
	}
	private static long countStrlength(List<String> list) {
		int count=0;
		for(String str:list) {
			if(str.length()==3)
				count++;
		}
		return count;
	}

}
