package com.armstrong;

import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Prime number or not: ");
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int s=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				s++;
				break;
			}
		}
	   if(s==0) {
		   System.out.println(num +":is Prime Number");
	   }
	   else
	   {
		   System.out.println(num+" :is Not Prime Number");
	   }
	}
}
