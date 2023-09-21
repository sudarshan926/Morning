package CheckPrimeNum;

import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(String[] args) {
		//check Prime Number
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=Sc.nextInt();
		int c=0;
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				c++;
				break;
		}}
			if(c==0){
				System.out.println("Prime Number");
			}else {
				System.out.println("Not Prime Number");
			}
			
			
			int d = 90;
			int e = ++d + ++d + ++d + d + ++d + d + d + ++d;
			System.out.println(d);
		}
	}

