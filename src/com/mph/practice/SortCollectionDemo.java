package com.mph.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import com.mph.Employee;

public class SortCollectionDemo {

	public static void main(String[] args) {
		int[] array= {17,8,2003,44,7,18,19};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		List list=new ArrayList();

		list.add(44);
		list.add(84);
		list.add(17);
		list.add(18);
		list.add(19);
		Collections.sort(list);
		System.out.println(list);
		
		Employee e1=new Employee(12,"Ram");
		
		

	}

}
