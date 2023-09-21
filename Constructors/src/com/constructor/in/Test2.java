package com.constructor.in;

class Demo{
	
	int EmpID;
    String EmpName;//Instance Variable
    String EmpCity;
    
      Demo(int e,String n,String c){
    	EmpID=e;
    	EmpName=n; //Local Variable
    	EmpCity=c;
    	System.out.println(EmpID+"  "+EmpName+"  "+EmpCity);
    } 
	
}
class Test1 extends Demo{

	Test1(int e, String n, String c) {
		super(e, n, c);
		// TODO Auto-generated constructor stub
	}
	   
}
public class Test2 {
	   
	public static void main(String[] args) {
		System.out.println("Parameterized Constructor: ");
		
		Test1 t=new Test1(101,"Amar"," Pune");
		Test1 t1=new Test1(102,"Akash","Mumbai");
		Test1 t2=new Test1(103,"Suraj","Latur");
	}
}
