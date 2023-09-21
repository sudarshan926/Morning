package com.throwandthrows.in;

public class Throw1 {
	
	public  static void show() {
		int a=10/0;
			throw new ArithmeticException("Not null");
	}
	public  static void  show1() {
		int[] arr= {2,3,4,5,6};
		System.out.println(arr[11]);
		throw new ArrayIndexOutOfBoundsException("Can not accept");
	}
	public  static void Advshow() {
		try {
			try {
				show();
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception"+e.getMessage());
		     }
			try {
				show1();
			 }
			catch(ArrayIndexOutOfBoundsException ex)
			{
			System.out.println("ArrayIndexOutOfBounds Exception"+ex.getMessage());
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		Throw1 t1=new Throw1();
		t1.Advshow();
	}
}
