package com.modifies;
//Abstract Methods Belong to the abstract class does not method 
//body but provides subclass
// We can not create of Abstract
//we should override the abstract method.

//Why use a oops:
//1)
  
 abstract class Demo2{
	   String name;
	    int empId;
	   abstract void add();
	   
	   abstract void add1();
 }
  abstract class Demo1 extends Demo2{
	   String data;
	   int Date;
	@Override
	void add() {
		System.out.println("Abstract Data");
		System.out.println(name+"  "+empId);
	
	   }
  }
  class Demo3 extends Demo1{
	void add1() {
		System.out.println("Abstract Data2:");
	
	   }
     }
 class Abstarct {
  
	public static void main(String[] args) {
		Demo1 d1=new Demo3();// also we can create
//		Demo3  d1= new Demo3();
		d1.data="Vikas";
		d1.Date=31;
		d1.name="Mahesh";
		d1.empId=1001;
		d1.add();
		d1.add1();
	}
}
 