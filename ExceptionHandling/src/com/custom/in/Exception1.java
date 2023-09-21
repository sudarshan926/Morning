package com.custom.in;

import java.util.Scanner;

class SurajException extends RuntimeException {
	SurajException(String message){
		super(message);
	}
}
public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("candidate Marks :");
		int mark =sc.nextInt();
	
		try {
			if(mark<100) {
				System.out.println("Marks :"+mark);
			}
			throw new SurajException("good Marks");
		}
		catch(SurajException ec) {
			System.out.println("Marks: "+ec.getMessage());
		}
	}
}
