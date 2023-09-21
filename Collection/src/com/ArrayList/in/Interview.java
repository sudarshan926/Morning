package com.ArrayList.in;

import java.util.ArrayList;

public class Interview {
	public static void main(String[] args) {
		ArrayList<Integer>list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(5);
		list.add(4);
		list.add(8);
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum=sum+i;
		}
		System.out.println("Addition of List Element :"+sum);
		System.out.println("------------");
		System.out.println("Even Numbers In List:");
		for(int j=0;j<list.size();j++) {
			if(j%2==0) {
				System.out.print(j+" ");
			}
		}
	}
}
