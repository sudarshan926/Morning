package com.fusion.in;

public class StringLogic {

	public static void main(String[] args) {
		String s="fusion";
		String s3="fusion";
		String s1=new String ("fusion");
		String s2=new String ("fusion");
		String s4="vionsys";
		String s5="FuSIon";
		String s7="uihvuh uuygfgv ipolkjtfyjhvu opigjc";
				
			
		System.out.println(s7.split("i", 1));
		System.out.println(s==s3);      // true;
		System.out.println(s==s1);      // false
		System.out.println(s1==s2);     // false;
		System.out.println(s.equals(s1)); //true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s.equals(s3)); // true
		System.out.println(s.equals(s5)); // false;
		System.out.println(s.equalsIgnoreCase(s5));//true
		System.out.println(s.compareTo(s5));//+number
		System.out.println(s5.compareTo(s));//-Number
		System.out.println(s4.compareTo(s5));//+Number
		System.out.println(s5.compareTo(s5)); //0
		
	}
}
