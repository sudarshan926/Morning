package com.Covariant.in;

import java.lang.reflect.Array;
import java.util.ArrayList;

class A{
	public static Object display() {
		System.out.println("Covariant Return Type Object");
		return "xyz";	
	}
} 
class B extends A{
	public static Class display()
	{
		System.out.println("Use Of non-Primitive Class");
		return null;	
	}
}
class C extends A{
	public static Array display()
	{
		System.out.println("Use Of non-Primitive Array");
		return null;	
	}
}
public class Covarient {

	public static void main(String[] args) {
		A.display();
		B.display();
		C.display();
	}
}
