package com.whileloopLogic;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int s=121;
		int d=0;
		int r;
		while(s>0)
		{
			s=s%10;//1
			
			d=s*10+d;//11
			
			
			System.out.print(d);
			
		}
		
	}

}
