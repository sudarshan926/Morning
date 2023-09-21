package com.overrideException;

class Parent{
	void show()throws Exception{
		System.out.println("Parent class");
	}
}
class Child extends Parent{
	@Override
	void show()throws ArithmeticException{
		System.out.println("Child class");
}
}
public class OverrideException {

	public static void main(String[] args) {
		Child c=new Child();
		c.show(); //overriding no probleam
		Parent p=new Parent();
		try {
			p.show(); //here comes problem
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
