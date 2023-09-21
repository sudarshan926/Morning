package com.constructor.in;

class Parent{
		Parent(int a,String b){
			System.out.println("Parent: "+a+" "+b);
		}
}
class Child extends Parent{
	  Child(){
		  super(10,"suraj");//pass Argument in Parent class
		  System.out.println("Child class");	  
	  }
}
public class SConstruct {

	public static void main(String[] args) {
		Child c =new Child();
	}
}
