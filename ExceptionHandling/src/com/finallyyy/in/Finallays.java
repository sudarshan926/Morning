package com.finallyyy.in;

public class Finallays {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception ex) {
			System.out.println("Can't devide by zero");
		}
		finally {
			System.out.println("Always Executes Block");
		}
		
	}

}
