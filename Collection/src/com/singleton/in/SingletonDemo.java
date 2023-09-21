package com.singleton.in;

public class SingletonDemo {
	private static SingletonDemo obj;
	SingletonDemo(){
	}
	public static synchronized SingletonDemo getObject() {
		
		if(obj==null) {
			obj=new SingletonDemo();
		}
		return obj;	
	}
}
