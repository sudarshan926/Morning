package com.ArrayList.in;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List<Object> list=new ArrayList();
		List<Object> list1 = list;
		list.add(3);
		list.add(1);
		list.add(2);
		list.add("Virat");
		list.add("Vilas");
    list1.add("Akash");
    list1.add("Akhilesh");
    list1.add("Amar");
		list.addAll(list1);
		  System.out.println(list);
	}

}
