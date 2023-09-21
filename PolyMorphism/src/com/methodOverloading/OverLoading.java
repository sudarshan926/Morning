package com.methodOverloading;

public class OverLoading {
	public int add(int a, long b) {

		int m=(int)(a+b);
		return m;
	}
	public int add(float a, double b, long c) {
			int n=(int)(a-b-c);
			return n;
	}
	public void add(int p,int q) {
		System.out.println("Mod: "+p%q);
	}
	public void add(int p,float q ) {
		System.out.println("Division : "+p/q);
	}
	public int add(int p,int q,int r) {
		int g=(int)(p*q*r);
		return g;
	}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		System.out.println("Changing the dataType: ");
	System.out.println("Addition :"+o.add(12, 35l));	
	System.out.println("Substraction: "+o.add(30.0f, 40.0, 50)); 
	System.out.println("Substraction :"+o.add(14.0f, 10.0, 35)); 
    o.add(23, 3);
    o.add(100, 25f);
	System.out.println("Multiplication :"+o.add(+3, 2, 5));
	}
}
