package com.methodOverriding.in;


class Parent2{
	 public void Output(int a, int b) {
		 
		 System.out.println("Addition is :"+(a+b));
	 }
}
public class Overriding1 extends Parent2 {
	public void Output(int a, int b) {
		 
		 System.out.println("Substraction is :"+(a-b));
	 }

	public static void main(String[] args) {
		Overriding1 O=new Overriding1();
		O.Output(20, 10);
		
	}

}

