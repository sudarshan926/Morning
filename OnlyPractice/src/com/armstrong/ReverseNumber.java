package com.armstrong;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print Reverse Number: ");
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse Num is: "+sum);

	}

}
