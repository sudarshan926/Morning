package com.singleton.in;

public class Main {

	public static void main(String[] args) {
		SingletonDemo s= SingletonDemo.getObject();
		SingletonDemo s2=SingletonDemo.getObject();
		System.out.println("Check HashCode value:");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("check Both Object is same Or not:");
		System.out.println(s==s2);
	}
}
