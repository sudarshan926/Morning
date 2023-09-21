package com.throwandthrows.in;

public class Throws {
	
	public static void show() {
		int a=10/0;
	}
	public static void show1() {
		int b=10/0;
	}
	public static void Advshow() {
		try {
			show();
			show1();
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");	
		}catch(Exception ex) {
			System.out.println("Exception");
		}
	}
	public static void main(String[] args) {
		Advshow();
	}

}
