package com.armstrong;

public class Demo1 {
	
	 Demo1()
	  { 
		 this(10,20);
		 
		 System.out.println("default constructor");
	 }
	 
	 Demo1(int a, int b)
	 {
		 this(10,20,30);
		
		 System.out.println(a+" "+b);
	 }
	 
	Demo1(int a, int b,int c)
	 {
		 System.out.println(a+" "+b+" "+c);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		
	}

}
