package com.Set.in;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Vector;

public class HashSetLinkedHashSet {

	public static void main(String[] args) {
		HashSet <Integer >s1=new HashSet<>();
		//1)Not Maintained Insertion Order
		System.out.println("HashSet: ");
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(30);//2) duplicate not allowed
		s1.add(null);
		s1.add(null);//3) it store only one null value
		System.out.println(s1);
		
		LinkedHashSet <Integer> s2=new LinkedHashSet<>();
	//" Major diff In LinkedHashSet Insertion Order maintained"
		System.out.println("LinkedHashSet:");
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(30);//2) duplicate not allowed
		s2.add(null);
		s2.add(null);//
		System.out.println(s2);
		
		Vector<Integer> s21=new Vector<>();
		//" Major diff In LinkedHashSet Insertion Order maintained"
			System.out.println("LinkedHashSet:");
			s21.add(10);
			s21.add(20);
			s21.add(30);
			s21.add(40);
			s21.add(30);//2) duplicate not allowed
			s21.add(null);
			s21.add(null);//
			System.out.println(s21);
			System.out.println(s21.capacity());
			ListIterator ltr=s21.listIterator();
			while(ltr.hasPrevious()) {
				System.out.println(ltr.previous());
			}
	}
}
