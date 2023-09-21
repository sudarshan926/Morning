package com.methodOverloading;
class A{
	 public void show() { // Override
		 System.out.println("Class A");
	 }
	 public void show2(int a, int b) { // Overloading
		 System.out.println("Class A Addition :"+(a+b));
	 }
}
class B extends A{
	@Override
	public void show() {
		 System.out.println("Class B");
	 }
	@Override
	 public void show2(int a, int b) {
		 System.out.println("Class b Addition :"+(a+b));
	 }
}
public class Polymorphism {	
	public static void main(String[] args) {
		System.out.println("Polymorphism: ");
		B b=new B();
		b.show();
		b.show2(40, 50);
		A a=new A();
		a.show();
		a.show2(30, 20);
	}

}
