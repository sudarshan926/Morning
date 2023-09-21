package com.abstraction;

abstract class Abstraction {
	// We can abstract methods declare only not implements
	  abstract void addition();
	  abstract void substraction();
      void Multiplication(int a , int b)
   // In abstract Method we can create abstract methods                               
      {
	       	  int c=a*b;
	       	  System.out.println("Multiplication :"+c);
	  }
      }   
  class Child extends Abstraction{
	void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition is :"+c);
	}
	@Override
	void substraction() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Substraction is :"+c);
	}  
	public static void main(String[] args) {
		// we can creates only abstract refrence not a object
		Child  c=new Child ();
		c.addition();
		c.substraction();
		c.Multiplication(20, 10);
	}
  }

