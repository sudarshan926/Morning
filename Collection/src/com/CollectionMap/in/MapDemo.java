package com.CollectionMap.in;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String>map =new HashMap<>();
		map.put(null,"Rohit");
		map.put(null,"YuvRaj");// we can store only one null value
		map.put(1, "KlRahul");
		map.put(2, "Virat");
		map.put(3, "Hardik");
		map.put(4, "Dhoni");
		map.put(5, "Jadeja");
		map.put(6, "Ashwin");// in HashMap we can not store duplicate Key
		map.put(6, "Siraj");
       System.out.println(map);
       System.out.println("Looping :");
       Set<Integer>keySet=map.keySet();
   	
   	for(int k1:keySet) {
   		System.out.println(k1);
   	}
       
		/*
		 * for(Map.Entry<Integer, String> m:map.entrySet()) {
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 */
       LinkedHashMap<Integer,String>map1 =new LinkedHashMap<>();
       map1.put(null,"Rohit");
		map1.put(null,"YuvRaj");// we can store only one null value
		map1.put(1, "KlRahul");
		map1.put(2, "Virat");
		map1.put(4, "KlRahul");
		map1.put(3, "Virat");
		map1.put(6, "Hardik");
		map1.put(4, "Dhoni");
		map1.put(5, "Jadeja");
		map1.put(7, "Ashwin");// in HashMap we can not store duplicate Key
		map1.put(8, "Siraj");
		System.out.println(map1);
		map1.replace(4, "Bumbrah");

	
		/*
		 * for(int k1:k) { System.out.println(k1); }
		 */
	/*
	 * System.out.println(map1); map1.clear();
	 */
       }
}
