package com.logic.in;

public class Demo {
	
	int amount=0;
	 void show() {
		 for(int i=0;i<=5;i++)
		 amount =amount +100;
	 }
	
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println("skjbh"+d.amount);
		int a = 10;
		int b = 0;
		int[] p = { 1, 2, 3 };
		System.out.println(a + b);
		System.out.println(a * b);
		try {
			System.out.println(a / b);
			System.out.println(p[1]);
		} catch (Exception e2) {	
			System.out.println("Catch Exception----");
		}
		System.out.println(a - b);
		System.out.println("Hello");
	}
}
