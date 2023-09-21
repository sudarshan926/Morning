package com.thread.in;

public class MyThread {

	public static void main(String[] args) {
		
		System.out.println("My thread Class");
		try{Thread.sleep(7000);}catch(Exception e) {};
		System.out.println("Hellow");
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Current Thread Name :"+name);
		t.setName("MyThread");
		System.out.println(t.getName());
		System.out.println("Id of Current Thread Classs :"+t.getId());

	}

}
