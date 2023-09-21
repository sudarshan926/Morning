package com.encapsulation.in;


class C{
	private int a;
	
	public int getA() {
		
		return this.a;
	}
	
	public void setA(int a) {
		this.a=a;
	}
}

public class Encapsulation  extends C{
	
	public static void main(String[] args) {
		
		C c=new Encapsulation();
		c.setA(55);
		System.out.println("Value Of a: ");
		System.out.println(c.getA());
	}

}