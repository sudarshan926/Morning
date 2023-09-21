package com.finallyyy.in;

public class Finally {

	public static void main(String[] args) {
		try {
			String s=null;
			int s1=s.length();
			System.out.println(s1);
			
		}
		catch(NullPointerException e) {
			System.out.println("Null poiinter Exception");	
			System.exit(0);
		}
		finally {
			System.out.println("Always execute");
		}
		System.out.println("Hello Java");
	}

}
