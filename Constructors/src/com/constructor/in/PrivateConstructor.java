package com.constructor.in;

public class PrivateConstructor {
	
	
	private PrivateConstructor() {
		this("Suraj Rakh","Suraj@1234");
		System.out.println("Private constructor");
	}
	 private PrivateConstructor(String Uname, String pass) { //private  parameterized constructor
		System.out.println("User name: "+ Uname);
		System.out.println("User Password: "+pass);
	}

	public static void main(String[] args) {
		PrivateConstructor p=new PrivateConstructor();

	}

}
