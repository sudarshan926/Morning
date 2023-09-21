package com.inheritance;
import java.util.Scanner;

public class SimpleCalProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice, a, b;
            System.out.println("\nCalculator Program:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. division");
            System.out.println("5. EXIt");       	       	
            do {           	
            	System.out.print("Enter Value Of A :"); a=sc.nextInt();
            	System.out.print("Enter Value Of B :"); b=sc.nextInt();
            	System.out.print("Enter your choice: "); choice = sc.nextInt();          
            switch (choice) {
                case 1:               	  
                    System.out.println("Addition : "+(a+b) +"\n");
                    break;
                case 2:
                    System.out.println("Substraction : "+(a-b)+"\n");
                    break;
                case 3:              	  
                    System.out.println("Multiplication : "+(a*b)+"\n");
                    break;   
                case 4:  
                    System.out.println("Division : "+(a/b)+"\n");
                    break;
                case 5:             
                    System.out.println("Exiting Simple Calculator. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }}


