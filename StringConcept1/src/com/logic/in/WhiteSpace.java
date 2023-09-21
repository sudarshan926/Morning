package com.logic.in;

public class WhiteSpace {

	public static void main(String[] args) {
		String s1=" Well come to fusion Institute";
		System.out.println("Original String :"+s1);
		int org=s1.length();
		System.out.println("Length of original String :"+org);
		String rev=s1.replace(" ","");
		int rev1=rev.length();
		System.out.println("Length of without white space String :"+rev1);
		int replace=(org)-(rev1);
		System.out.println("Number of white spaces in String :"+replace);
	}

}
