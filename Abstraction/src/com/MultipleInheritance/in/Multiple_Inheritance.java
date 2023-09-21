package com.MultipleInheritance.in;

interface Splendor{
	
 abstract void splendor();
}	
interface Bullet{
	 abstract void bullet();
 }
class Bikes implements Splendor,Bullet{
	
	@Override
	public void splendor() {
		System.out.println("Splendor is my favourite Bike");
	}
	
	 public  void bullet() {
			System.out.println("Bullet is my favourite Bike");

	 }
}
//Achieved Multiple inheritance through Interface 
  public class Multiple_Inheritance {
	public static void main(String x[]) {
		System.out.println("Achieved Multiple inheritance through Interface: ");
		Bikes b=new Bikes();
		b.bullet();
		b.splendor();
	}
}
