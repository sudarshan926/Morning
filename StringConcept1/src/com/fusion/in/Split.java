package com.fusion.in;

public class Split {

	public static void main(String[] args) {
	String s1="Well Come To Fusion Institute Kharadi, Pune ";
	System.out.println("Original String :"+s1);
	
	System.out.println("\nSpliting from letter 't' :");
	String[] str=s1.split("t"); // split from letter t
	
	
	for(String a:str) {
		System.out.println(a);	
	}	
   }	
}

