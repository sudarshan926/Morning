package com.whileloopLogic;

public class ASCII_VALUE {

	public static void main(String[] args) {
		char c='A';
		int d=c;// for ascii values
		while(c<=100)
		{
		  while(d<100)//nested whiile loop
		  {
			System.out.print(c+"="+d+" ");
			c++;
			d++;
		  }

		}
	}
}
