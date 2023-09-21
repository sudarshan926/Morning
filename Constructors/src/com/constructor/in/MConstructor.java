package com.constructor.in;

class Demo1{
     
	   public void Demo1(int a,String n) {
	    	System.out.println("Parent class Method: "+a+" "+n);	
	    }
}
class Demo2 extends Demo1{
	
	public void Demo1() {
		super.Demo1(10,"Fusion");// invoke parent class method
		System.out.println("Child class Method");
		
    }
}
public class MConstructor {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.Demo1();
	}
}
