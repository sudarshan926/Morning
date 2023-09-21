package com.practice.in;

public class SimpleDubbugging {
	public void Show(int a,int b) {
		System.out.println("Addition :"+(a+b));
	}
	public static void show1(int a, int b) {

		System.out.println("Substraction :"+(a-b));
	}
	public void show3(int a, int b) {
		a=10;
		b=20;
		 System.out.println("Multiplication :"+a*b);	
	}
	public static void main(String[] args) {
		SimpleDubbugging s=new SimpleDubbugging();
		s.Show(33, 40);
		s.show3(44, 5);
		SimpleDubbugging.show1(44, 66);
	}

}
