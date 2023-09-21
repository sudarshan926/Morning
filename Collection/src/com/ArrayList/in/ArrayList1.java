package com.ArrayList.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayList1 {
	
	public static  Object Show(List<Object> list1) {
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		return list1;
	}
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		ArrayList1.Show( list);
		list.add("Virat");
		list.add("Rohit");
		list.add("Mahi");
		list.add("Rishab");
		list.add("Suryakumar");
		list.add("Ashwin");
		list.add("Hardik");
		System.out.println(list);
		
		
	}

}
