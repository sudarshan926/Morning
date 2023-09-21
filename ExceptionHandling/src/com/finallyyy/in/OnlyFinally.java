package com.finallyyy.in;

public class OnlyFinally {

	public static void main(String[] args) {
		
		// we can write after try block finally block  without catch but we can't handle exception 
		int a=10;
		int b=20;
		int d=0;
		System.out.println(a+b);
		try {
			int c=a/d;
			System.out.println(c);
		}finally {
			System.out.println("Always Execute");	
		}
	}
}
