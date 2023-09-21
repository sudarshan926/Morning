package com.tostring.in;

public class ToString {

	int id;
	String name;
	
	@Override
	public String toString() {
		return "ToString [id=" + id + ", name=" + name + "]";
	}

	public ToString(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String ToString() {
		return "Id"+id+"Name :"+name;
	}
	public static void main(String[] args) {
		ToString t=new ToString(1, "Suraj");
		ToString t1=new ToString(2, "Sumit");
		System.out.println(t);
		System.out.println(t1);
	}
}
