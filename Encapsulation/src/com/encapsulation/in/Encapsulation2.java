package com.encapsulation.in;
class A{
	private String Uname;
	private String pass;

	public String getUname() {
		 return this.Uname;
	}
	public void setUname(String Uname) {
		this.Uname=Uname;
	}
	
	public String getpass() {
		 return this.pass;
	}
	public void setpass(String pass) {
		this.pass=pass;
	}
}
public class Encapsulation2 extends A {

	public static void main(String[] args) {
		Encapsulation2 e=new Encapsulation2();
		e.setpass("Surya@1234");
		e.setUname("Sudarshan");
		System.out.println("UserName :"+e.getUname());
		System.out.println("Password :"+e.getpass());
	}
}
