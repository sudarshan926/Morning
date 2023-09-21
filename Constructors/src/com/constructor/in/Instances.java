package com.constructor.in;

class Parent1{
	String City="Pune";
}
class Child1 extends Parent1{
	String City="Mumbai";
	public void show() {
		System.out.println(" Child1: "+City);
		System.out.println("Parent1 :"+super.City);// refer immediately parent class 
		                                            // instance variable.                                        
	}
}
public class Instances {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.show();
	}
}
