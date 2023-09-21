package com.exception.in;

public class StringOutOfBoundsException {

	public static void main(String[] args) {
		try {
		String s1="Well come to java Full stack";
		System.out.println(s1.charAt(55));
	}
	catch(StringIndexOutOfBoundsException ex){
		System.out.println(ex);
		System.out.println("For this string :Well come to java Full stack");
	}
		catch(Exception ex1) {
			System.out.println(ex1);
		}
	}
}
