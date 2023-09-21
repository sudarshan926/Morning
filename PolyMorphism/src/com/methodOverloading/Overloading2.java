package com.methodOverloading;

import com.methodOverriding.in.Overriding1;

public class Overloading2 extends Overriding1 {
	
	 public void show(int a, int b) {
		 System.out.println("Addition is: "+(a+b));
	 }
	 public void show(int a, int b,int c) {
		 System.out.println("Substraction is: "+(a-b-c));
	 }
	 
	 public void show(int a, int b,int c,int d) {
		 System.out.println("multiplication is: "+(a*b*c*d));
	 }


	public static void main(String[] args) {
		System.out.println("Changing the argument: Method Oveloading");
		Overloading2  o=new Overloading2 ();
		o.show(10, 20);
		o.show(60, 40, 10);
		o.show(2, 3, 4, 5);
		o.Output(10, 20);
	}

}
