package com.methodOverriding.in;

	class Parent{
		
		protected void show(String  a, String b) {
			System.out.println(a+" "+b);
		}
		protected static void show(String a) {
			System.out.println(a);
		}
	}
	class Child extends Parent{
		
		@Override
		protected void show(String a, String b) {
			System.out.println(a+" "+b+" "+"BMW");
		}
		public static void show(String a) {
			System.out.println(a);
		}
	}
	public class MethodOverriding {
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.show("Banglo", "Farm");
		Parent c=new Child();
		c.show("Banglo","Farm");
		Child c1=new Child();
		c1.show("Banglo","Farm");	
		c1.show("Suraj");
	}
}
