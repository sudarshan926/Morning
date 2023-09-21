package com.armstrong;

class P1{
	public void show(int a, int b) {
		this.Out(10,20.0f);
		System.out.println(a+" "+b);
	}
	
	public void Out(int a, float b) {
		System.out.println(a+b);
	}
}
class P2 extends P1{
	public void show1() {
		super.show(10,20);
		System.out.println("Child class P2");
	}
}
public class Super {

	public static void main(String[] args) {
		P2 p=new P2();
		p.show1();
	

	}

}
