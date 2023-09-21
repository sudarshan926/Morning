package com.fusion.in;

public class Ovels {

	public static void main(String[] args) {
		
		String s1="Fusion Institute Pune";
		System.out.println("Ovels present int the string :");
		for(int i=0;i<s1.length();i++) {
			char char1=s1.charAt(i);
		      if(char1=='a' || char1=='e' || char1=='i'||char1=='o'|| char1=='u') {
		    	  System.out.print(char1+" ");
		    	 
		      }
		      
		}
		

	}

}
