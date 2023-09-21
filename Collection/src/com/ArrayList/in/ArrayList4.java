package com.ArrayList.in;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>(0);
		//ArrayList<Integer> myList = new ArrayList<>(0);

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);
		 int sum=0;
		 for(int i=0;i<=list.size();i++) {
			 sum=sum+i;
		 }
		 System.out.println(sum);
		 
		System.out.println("Simple way:");
		System.out.println(list);
		System.out.println("For using for Each: ");
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("\nFor using Iterator only forword Direction:");
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\nFor using ListIterator forward Direction:");
		ListIterator<Integer> ltr=list.listIterator();
		
		while(ltr.hasNext()) {	
			System.out.print(ltr.next()+" ");
		}
		System.out.println("\nFor using ListIterator backword Direction:");
		while(ltr.hasPrevious()) {
			System.out.print(ltr.previous()+" ");
		}
		
		
		
	    }
	
	}

