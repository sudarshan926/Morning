package com.armstrong;

public class test_2 {
	

	test_2(int a, int b ,int c) // 
	{
		System.out.println("value od add:"+(a+b+c));
	}
	test_2(int a, float b, long c)// using diffrent type of varaible 
	{
		
		System.out.println("value of sub:"+(a+b-c));//@constructor overloading
	}
	test_2(String a, String b) //@constructor overloading
	{
		System.out.println("____"+a +" "+b+"____");
	}

	public static void main(String[] args) {
		test_2 t3 =new test_2("vishal", "jadhav");// obj 
		test_2 t1 =new test_2(20, 30, 40);// obj
		test_2 t2=new test_2(20, 30.f, 40);// obj
	}

}
