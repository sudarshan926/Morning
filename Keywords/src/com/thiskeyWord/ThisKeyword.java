package com.thiskeyWord;

import java.util.ArrayList;

/*This keyword used to main purpose of eliminate the confusion between class Attributes and 
  parameter with the same name.
  1)this keyword is used to refer the current class instance variables
  2)this keyword is used invoke the current class method
  3)this keyword is used to invoke the  current class constructor
  4) this() is used to pass the argument in method call
  5) this () keyword is used to pass the arguments in constructor call
*/

class This{
	// confused jvm which variables local or instance.
		String name;
		int age;
		String city;
		
		public static final int  j=10;
		static final  public int k=10;
		static final private int l=10;
	
		public This() {
			System.out.println("Hellow Constructor");
		}
		
		This(int a,int b) {
			
			System.out.println(a+" "+b);
		}

		This( String name ,int age, String city)
		 {
			this(10,20);
			
			this. name=name;
			this.age=age;
			this.city=city;
			 System.out.println(name+" "+age+" "+city);
		 } 
	public void add() {
		
		
		System.out.println("This is parent class");
	}

	public static int getL() {
		return l;
	}
	
}	
class Super extends This{
	
         public void add() {
        	 
        	 super.add();
		System.out.println("This is child class");
	}
}	
 class ThisKeyword {
	static public void  main(String[] args) {
		This t = new This("akash",34,"Latur");
		Super s=new Super();
		s.add();
	   System.out.println(t.j);
	   System.out.println(t.k);
	   System.out.println(t.getL());
	}

}
