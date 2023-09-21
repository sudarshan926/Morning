package com.conget.in;

import java.util.Scanner;

public final class Test {
	private final String name;

	public String getName() {
		return name;
	}

	public Test(String name) {
	
		this.name = name;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		
		while(i!=4) {
		String name=sc.nextLine();
		Test t = new Test(name);
		System.out.println("FIRST NAME :"+t.getName());	
			i++;
		}
		
	}
}
