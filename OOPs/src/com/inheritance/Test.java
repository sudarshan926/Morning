package com.inheritance;
  class Parent{
	public void Parent() {
		System.out.println("This is Parent Class");
	}
}
  class Child extends Parent{
	public void Parent() {
		System.out.println("This is Child Class");
	}
}
public class Test {
     //Simple Inheritance
	public static void main(String[] args) {
		Parent c= new Child ();
		c.Parent();
		
	}

}
