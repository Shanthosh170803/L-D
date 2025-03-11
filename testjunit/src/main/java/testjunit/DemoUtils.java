package testjunit;

import java.util.Arrays;
import java.util.List;

public class DemoUtils {
	int add(int a,int b) {
		return a+b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int addition(int... nums) {
		int res=0;
		for(int i:nums) {
			res=res+i;
		}
		return res;
	}
	static boolean isEven(int num) {
		return num%2==0;
	}
	static String getMessage() {
		return null;
	}
	static int[] getNumbers() {
		return new int[] {1,2,3};
	}
	static List<String> getName(){
		return Arrays.asList("Asha","Bala","Cibi");
	}
	static void throwException() {
		throw new RuntimeException("This is a exception");
	}
	
	public static void main(String[] args) {
		DemoUtils d=new DemoUtils();
		System.out.println(d.add(12, 20));
		System.out.println(d.add(12, 30));

	}

}
