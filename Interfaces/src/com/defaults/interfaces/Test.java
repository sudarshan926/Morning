package com.defaults.interfaces;
interface H1{
	default Object m1() {
		System.out.println("This is  class P1-m1 Method");
		return null;
	}
}
//class Child implements P1{
//
//	@Override
//	public String  m1() {
//		
//		//P1.super.m1();// Default methods override, used super keyword because solve the diamond problem
//		//P2.super.m1();// 
//		
//		
//		return "0";
//	}
//	
//}
public class Test implements H1 {
	@Override
	
	public String m1() {
		//System.out.println("This is  class P1-m1 Method");
		return null;
	}

	public static void main(String[] args) {
		//System.out.println("Using Defult Methods: ");
		H1 c=new Test();
		c.m1();

	}

}
