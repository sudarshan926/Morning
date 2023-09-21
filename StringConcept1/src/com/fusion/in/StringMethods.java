package com.fusion.in;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Suraj";
				s="sushil";
		System.out.println(s);
		
		
		String s1="suraj";
		String s2="Sujit";
		String s5="suraj";
		String s3=s1+s2; // surajSujit
		
		boolean s4=(s1==s5); 
		boolean s7=s1.equals(s5); 
		System.out.println(s3=="surajSujit"); // false 1
		System.out.println(s3.equals("surajSujit")); // true 2
		
		System.out.println(s3); //surajSujit
		System.out.println(s4); // true
		System.out.println(s7); // true
		System.out.println(s5); //suraj
		
	}

}
