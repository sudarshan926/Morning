package com.fusion.in;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Palindrome or not ");
		System.out.print("Enter name :");
		String s=sc.nextLine();
		System.out.println("Entered name :"+s);
		String rev="";
		sc.close();
		
		for(int i=s.length()-1;i>=0;i--) 
			rev=rev+s.charAt(i);
		if(s.equals(rev)) 
			System.out.print("String is palindrome :"+rev);
		else 
			System.out.println("String is not polindrome :"+rev);
	}
}
