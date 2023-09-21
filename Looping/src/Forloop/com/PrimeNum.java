package Forloop.com;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) throws ArithmeticException{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Check Prime Number :");
//		int n=sc.nextInt();
		int n=17;
		
		for(int i=2;i<=n;i++)
		{
			int v=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					v++;
				}
			}
			if(v==0)
			{
				System.out.print(i+" ");
			}	
		}
		
	}
}
