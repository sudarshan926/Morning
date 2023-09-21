package com.java8.in;
interface A{
	default void add() {
		System.out.println("Class A Add");
	}
}
interface B{
	default void add() {
		System.out.println("Class B Add");
	}
}
public class Demo implements A,B {
	@Override
	public void add() {
		B.super.add();
		A.super.add();
	}
	public static void main(String[] args) {
		System.out.println("Default Methods : Solve diamond Problem");
		Demo d=new Demo();
		d.add();
		}
}
