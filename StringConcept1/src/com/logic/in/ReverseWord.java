package com.logic.in;

public abstract  class ReverseWord {
   int a;
   int b;
   static int c=30;
	static {
		System.out.println("Intializing");
	}
     public abstract  void  show1();
	public  void show() {
		display();
		a=10;
		b=30;
		c=40;	
		System.out.println(a+b+c);
	}
	static void display() {
		c=30; // in static method  we can not access non static var	
		System.out.println(c);
	}
	 
	public static void main(String[] args) {
		//ReverseWord r=new ReverseWord();r.show();
	}
}
