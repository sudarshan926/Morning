package com.string;

public class Test implements P1,P2{
	
	@Override
	public void m1() {
		
		System.out.println("Child default");
	}

	public static void main(String[] args) {

		Test t1=new Test();
		t1.m1();
		

	}

}
