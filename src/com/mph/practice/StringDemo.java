package com.mph.practice;

public class StringDemo {

	public static void main(String[] args) {
		/*String s1="Java";
		String s2=new String("java");
		String s3="I Love Java";
		String s4="java";
		String s5=" ";
		String s6=null;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(2));
		System.out.println(s4.length());
		System.out.println(s5.isEmpty());
		System.out.println(s5.isBlank());
		System.out.println(s1.concat(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s4);
		System.out.println(s3.indexOf("J"));
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2,8));
		System.out.println("    Hello    ".trim());
		*/
		
		StringBuffer sb=new StringBuffer("Good");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		sb.append("Morning");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		
		StringBuilder ss=new StringBuilder("Good");
		System.out.println(ss.hashCode());
		System.out.println(ss.toString());
		ss.append("Morning");
		System.out.println(ss.hashCode());
		System.out.println(ss.toString());
	}

}
