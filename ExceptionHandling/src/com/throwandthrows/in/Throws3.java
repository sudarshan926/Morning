package com.throwandthrows.in;

import java.io.IOException;

public class Throws3 {

	public static void show() {
		throw new ArithmeticException("Hello Exception");
	}
	public static void show1() {
		throw new ArrayIndexOutOfBoundsException("Demo Exception");
	}
	public static void show3()  {
		//throw new  ArrayIndexOutOfBoundsException("Demo Exception");
		try {
			try {
				show();
			} catch (ArithmeticException ex) {
				System.out.println("Arith Handling Exception " + ex.getMessage());
			}
			try {
				show1();
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Array Handling Exception " + ex.getMessage());
			}
		} catch (Exception e) { 
			System.out.println("Hellow Bhai");
		}
}
	public static void main(String[] args) {
		show3();
	}
}
