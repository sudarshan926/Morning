package com.armstrong;

public class Test_3 {
	
	Test_3  (int a,int b, int c)
	{
		System.out.println("adding of 3_Num:"+(a+b+c));
	}
	

	public static void main(String[] args) {
		Child c1=new Child();
	}
}
class Child extends Test_3 {
	
	Child()
	{
		super(45,60,90);
	}
}
	
