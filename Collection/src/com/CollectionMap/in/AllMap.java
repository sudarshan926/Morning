package com.CollectionMap.in;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMap {

	public static void main(String[] args) {
		System.out.println("All Map Implemented Class: ");
		HashMap<Integer, String>map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(5, "D");
		map.put(4, "E");
		System.out.println("HashMap :Not maintained Insertion order");
		for(Map.Entry<Integer, String>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		LinkedHashMap<Integer, String>map1=new LinkedHashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(5, "D");
		map1.put(4, "E");
		System.out.println("LinkedHashMap :Maintained Insertion Order");
		for(Map.Entry<Integer, String>m:map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		TreeMap<Integer, String>map11=new TreeMap<>();
		map11.put(1, "A");
		map11.put(2, "B");
		map11.put(3, "C");
		map11.put(5, "D");
		map11.put(4, "E");
		System.out.println("TreeMap :Maintained Shorted Order");
		for(Map.Entry<Integer, String>m:map11.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
