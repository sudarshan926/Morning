package com.StaticMethodHiding;

class Super{
	
	public static void show() {
		System.out.println("This is Super Of Class OF -tatic Method");
	}
}
class Sub extends Super{
	//@Override When u try to use this annotation give u compile time error
   public static void show() {
	   System.out.println("This is Sub Class OF Static Method");
	}
}

public class MethodHidding {

	public static void main(String[] args) {
		System.out.println("Static- Method Hidding");
		Super.show();
		Sub.show();
	}
}
