package com.lambda;

public  class MyImp implements MyInter {
	
	public void show1() {
		System.out.println("This is Functional Interface");
		
	}


	public static void main(String[] args) {
//		MyImp m=new MyImp();
//		m.show1();
		MyImp m=new MyImp() {
			
			@Override
			 public void show1() {
				System.out.println("This is my First Annanomous class:");
				 
			 }
		};
		m.show1();
		
        MyImp m2=new MyImp() {
			
			@Override
			 public void show1() {
				System.out.println("This is my Second Annanomous class:");
				 
			 }
		};
		m2.show1();
		
//		
//		MyInter i = () ->  System.out.println("Say Hellow");
//		
//		i.show1();
//		
//		MyInter i2 = () -> System.out.println("Say Hellow2");
//		i2.show1();
//			
//		
//		SumInter s=( a,  b)  ->  a+b;
//	
//		System.out.println(s.sum(40, 50));
//		System.out.println(s.sum(20, 30));
//
	}

	
	
}
