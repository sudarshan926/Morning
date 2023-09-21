package com.armstrong;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=1221;
		int temp=n;
		int demo=n;
		int r;
		int sum=0;
		int last=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("PAlindrome number");
		}else {
			System.out.println("Not PAlindrome number");
		}

		
		int f=0;
	    int sec=1;
		int l;
		
		for(int i=2;i<=10;i++) {
			System.out.println(f+" ");
			l=f+sec;
			f=sec;
			sec=l;
		}
		
		
		while(n>0) {
			
	     r=n%10;
	     last=(r*r*r)+last;
	     n=n/10;
		}
		
		if(last==demo) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}

}
