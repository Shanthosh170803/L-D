package com.mph.practice;
interface foo{
	
}
class Alpha implements foo {

}
class beta extends Alpha{
	
}
class delta extends beta{
	public static void main(String args[]) {
		beta x=new beta();
		Alpha a=x;
	}
}
