package com.constructor.in;

public class Student1 {
	int id;
	String name;
	String city;
	Student1(int id,String name,String city){
		id=id;
		name=name;
		city=city;
		
	}
	void show() {
		System.out.println(id+" "+ name+" "+ city);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(1,"Akash","Pune");
		Student1 s2=new Student1(2,"Mangesh","Mumbai");
		s1.show();
		s2.show();
	}
}