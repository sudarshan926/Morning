package com.Set.in;

import java.util.TreeSet;

/*
-TreeSet doesn't follows Insertion order
-TreeSet is not indexBased Data Structure
-TreeSet follows SHORTING ORDER.
-In Tree Set store the only homogeneous element not a heterogeneous element
-In TreeSet does not store any null Values.
-it can not contain duplicate elements*/
public class TreeSeT {
	public static void main(String[] args) {
	TreeSet<Object> s1=new TreeSet<>();
	s1.add(10);
	s1.add(30);
	s1.add(45);
	//3)In Tree Set store the only homogeneous element not a heterogeneous element
	//s1.add("Suraj");
	 s1.add(20);
	 s1.add(20);//5 it can not contain dupliocates
	//4)cant store any null Value
	//s1.add(null);
	System.out.println(s1);
	System.out.println("Shorting Order elements :");
	for(Object i:s1) {
		System.out.print(i+" ");
	}
	System.out.println("\nIt not store duplicate, hetrogeneous,any null Value");
	}
}
