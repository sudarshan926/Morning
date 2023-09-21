package com.methodOverloading;
public class Overloading1 {
		public void add(int a, int b) {
			System.out.println("Addition is :"+a+" and "+b+" ="+(a+b));
		}
	

		public void add(float a, float b) {
			System.out.println("Substraction is :"+a+" and "+b+"= "+(a-b));
		}
	
		public void add(double a, double b) {
			System.out.println("Multiplication is :"+a+" and "+b+"= "+(a*b));
		}
	
	public static void main(String[] args) {
		System.out.println("Changing the DataType : Method Overloading");
		Overloading1 o=new Overloading1();
		o.add(10, 20);
		o.add(30.0f, 12.0f);
		o.add(30.0, 20.0);
	}
}
