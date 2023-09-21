package com.statics.interfaces;

 class Child implements S1,S2{
	// Here We can can not override static methods.
	 void p1() {
		 System.out.println("Demo");
	 }
}
public class Test1 {

	public static void main(String[] args) {
		System.out.println("Using static methods: ");
		 
//		 We can not call static method using CHILD class name because
//		 We can not override static methods 
		S1.p1();
		S2.p1();
		
		Child c=new Child(){
			@Override
			public void p1() {
			System.out.println("Hellow Java");
			}
		};
		c.p1();
		
		
				

	}

}
