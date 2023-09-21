package com.constructor.in;
class Test5{
	
	public Test5(){
		this(10,"Vikas");
		System.out.println("Default");
	}
   public Test5(int a, String b){
	   this("Java");
	System.out.println(a+" "+b);
  }
   public Test5( String y) {
	   this("Java",10,20);
	   System.out.println(y);
   }
   public Test5(String m,int a,int n) {
	   this(10,20,"Java");
	   System.out.println(m+a+n);
   }
   public Test5(int x, int y, String z) {
	   
	   System.out.println(x+y+z);
   }
}
public class ConstOverload {

	public static void main(String[] args) {
		System.out.println("Constructor Overloading: ");
		Test5 t3=new Test5();
		

	}

}
