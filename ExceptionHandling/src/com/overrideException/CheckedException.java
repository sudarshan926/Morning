package com.overrideException;

import java.io.IOException;

class Parent1{
	void show()throws IOException {
		System.out.println("Parent class");
	}
}
class Child1 extends Parent{
	@Override
	void show()throws IOException{
		System.out.println("Child class");
   }
}
public class CheckedException {

	public static void main(String[] args) throws IOException {
		Parent1 p=new Parent1();
		p.show();
	}

}

// Difference Between
// List Set
// ArrayList vs LinkedList
// ArrayList vs Vector
// LinkedList vs Vector
// HashSet vs TreeSet
// HashSet vs LinkedHashSet
//HashSet vs ArrayList
