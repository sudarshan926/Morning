package com.show1;

public class Exception123 {

	public static void main(String[] args) {
		
		try {
			int a=10/0;
		}
		catch(ArithmeticException ex) {
			System.out.println("Can't devide by zero"+ex);
		}
		catch(ArrayIndexOutOfBoundsException ex2) {
			System.out.println("ArrayIndexOutOfBoundsException ");
		}
		catch(StringIndexOutOfBoundsException ex1) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}

}
