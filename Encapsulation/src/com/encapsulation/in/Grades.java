package com.encapsulation.in;

public class Grades extends BankDemo{
	private String name;
	private int age;
	private double grade;
	
	 Grades(String name,int age,double grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
		System.out.println("Name :"+name+"\n"+"Age :"+age+"\n"+"Grade:"+grade+"\n"+"-------------");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) 
			this.age = age;
		else System.out.println("Asge should be greter than 0");
		
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		if(grade>=0 && 0<=grade)
		this.grade = grade;
		else  System.out.println("Grade should be greater than 0)");
	}
	public void show() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Grade :"+grade);
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		Grades  b=new Grades ("Suraj",22,88.09);
		b.withdrow(300);
		b.setAge(35);
		b.setGrade(95.8);
		b.setName("shubham");
		b.show();
		b.setAge(32);
		b.setGrade(67);
		b.setName("Sanjay");
		b.show();
		b.setBalance(3000.0);
		System.out.println("Current balance :"+b.getBalance());
		b.deposit(0);
		System.out.println("Current balance :"+b.getBalance());
		
}
}
