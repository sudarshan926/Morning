package com.armstrong;

public class Test_31 {
	static void add (float a,int b) 
	{
		System.out.println("value of adding 2_num:"+(a+b));// adding to  2_num
		
	}
	static void add(long a,float b, int c) // @method overloading 
	{
		System.out.println("value of adding 2_num:"+(a+b+c));// adding to 3_num
	
	}
     public static void main(String[] args) {
		Test_31.add(30.f,0);// callig from  (calass name.method name) because method are static
		//so no nedded to creat object to call method 
		Test_31.add(50, 30.f,90);
		
	}

}
