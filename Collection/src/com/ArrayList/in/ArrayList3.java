package com.ArrayList.in;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nanded");
		list.add("Latur");
		list.add("Pune");
		list.add("NAshik");
		list.add("Nagpur");
		list.add("Mumbai");
		System.out.println("Original List:"+list);
		list.add(0, "India");
		System.out.println("Add Element :"+list);
		boolean list1=list.contains("Pune"); //check present or not if present return true otherwise return false
		System.out.println("Contains :"+list1);
		System.out.println("Get :"+list.get(1));// return 1 position element
		System.out.println(list.set(2, "Kandhar"));// update set at Latur to Kandhar
		System.out.println("Set :"+list);
		System.out.println("Index Return :"+list.indexOf("Kandhar")); // return the position of element
		System.out.println("EMpty or not :"+list.isEmpty()); //check string empty or not
		int s=list.hashCode();
		System.out.println("HashCode Value OF List :"+s);
		Collections.sort(list);
		System.out.println("ShortedLIst :"+list);	

	}

	

}
