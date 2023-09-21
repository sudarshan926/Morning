package com.exception.in;

public class TryCatch {

	public static void main(String[] args) {
		int p=20;
		int q=30;
		System.out.println("p+q :"+p+q);
		try {
		int a=10;
		    a=a/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception:");
		}
		catch(Exception ex1) {
			System.out.println(ex1);
		}
	}
}
