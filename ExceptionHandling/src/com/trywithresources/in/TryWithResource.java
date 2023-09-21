package com.trywithresources.in;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		//Simple try with Resource
		
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Your Name :");
			String name=sc.next();
			System.out.println("Name :"+name);	
		}
		// not need to close scanner scanner automatically closed.
	}

}
