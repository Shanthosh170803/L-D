package com.mph.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Stream8 {

	public static void main(String[] args) {
		List<String> strlist=Arrays.asList("Rat","Cat","Mat","","Lion","Elephant","Tiger");
		System.out.println(strlist);
		
		long count=strlist.stream().filter(str -> str.length()==3).count();
		System.out.println("Count:"+count);
		
		List<String> slist=strlist.stream().filter(str->str.length()==3).collect(Collectors.toList());
		System.out.println(slist);
		
		long emtycount=strlist.stream().filter(str->str.isEmpty()).count();
		System.out.println("Empty String:"+emtycount);
		
		List<Integer> intlist=Arrays.asList(1,1,2,3,4,5,6,7,8,9);
		System.out.println(intlist);
		
		System.out.println("Sorted the list");
		intlist.stream().sorted().forEach(System.out::println);
		
		System.out.println("Soreted the list with distinct numbers");
		intlist.stream().sorted().distinct().forEach(System.out::println);
		
		
		IntSummaryStatistics stat=intlist.stream().mapToInt(num -> num).summaryStatistics();
		System.out.println("max:"+stat.getMax());
		System.out.println("min:"+stat.getMin());
		System.out.println("Avg:"+stat.getAverage());
		System.out.println("Count:"+stat.getCount());
		System.out.println("Sum:"+stat.getSum());
	}

}
