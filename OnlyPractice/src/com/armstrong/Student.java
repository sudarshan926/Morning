package com.armstrong;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int srno[]=new int[10];
		String Name[]= new String[10];
		int MathMarks[]=new int[10];
		int MarathiMarks[]=new int[10];
		int GeographyMarks[]=new int[10];
		
		for(int i=0;i<4;i++) {
			srno[i]=i+1;
		System.out.println("Enter name of student " +srno[i]+" :");
		
		 Name[i]=sc.nextLine();
		System.out.println("Enter Math Marks for "+Name[i]+":");
		
		MathMarks[i]=sc.nextInt();
		System.out.println("Enter Marathi Marks for :"+Name[i]+":");
		
		MarathiMarks[i]=sc.nextInt();
	    System.out.println("Enter GeographyMarks :"+Name[i]+":");
	    
	    GeographyMarks[i]=sc.nextInt();
	    sc.nextLine(); 
		}
//		 System.out.println("\nSr.No\tName\tMaths\tGeography\tMarathi");
//	        System.out.println("===============================================");
//	       
//	        for(int i=0;i<4;i++) {
//	        	System.out.println(srno[i]+ "\t" + Name[i]+ "\t" +MathMarks[i]+ "\t" +GeographyMarks[i]+"\t\t"+MarathiMarks[i]);
//	        }
//	        
//	        int aboveMarks35Math=0;
//	        int abovemarks35Marathi=0;
//	        int HighMarkGeography=Integer.MAX_VALUE;
//	        int LowestMarkMarathi=Integer.MIN_VALUE;
//	        String NAmeLowestMarkInMarathi="";
//	        String NameOfHighestMarkInGeography="";
//	        
//	        for(int i=0;i<4;i++) {
//	        	if(MathMarks[i]>35) {
//	        		aboveMarks35Math++;
//	        	}
//	        	if(MarathiMarks[i]>35) {
//	        		abovemarks35Marathi++;
//	        	}
//	        	if(GeographyMarks[i]>HighMarkGeography) {
//	        		HighMarkGeography=GeographyMarks[i];
//	        		NameOfHighestMarkInGeography=Name[i];
//	        	}
//	        	if( MarathiMarks[i]<LowestMarkMarathi) {
//	        		LowestMarkMarathi=MarathiMarks[i];
//	        		NAmeLowestMarkInMarathi=Name[i];
//	        	}
//	           else if (MarathiMarks[i] == LowestMarkMarathi) {
//	        	   NAmeLowestMarkInMarathi += ", " + Name[i];
//            }
//	        	
//	        }
//	        System.out.println("Well come to Report: ");
//	        System.out.println("Abhove 35 marks in Math  name Of Student Is: "+aboveMarks35Math);
//	        System.out.println("Abhove 35 marks name Marathi Of Student Is: "+abovemarks35Marathi);
//	        System.out.println("Name of Student Highest Got Mark In Geogrraphy : "+NameOfHighestMarkInGeography+"(Marks :"+NameOfHighestMarkInGeography+")");
//	        System.out.println("Name of student Lowest Got mark in Marathi :"+NAmeLowestMarkInMarathi+"( Marks :"+NAmeLowestMarkInMarathi +")");
//	        
//	        

	}

}
