package com.custom.in;

public class Custom {

	public static void main(String[] args) {
	int age=17;
		
	if(age>17) {
	System.out.println("You are not valid for develop java");
	}
	else {
	throw new GoslingException("You are able to develop java");
			
		}
	}
}
