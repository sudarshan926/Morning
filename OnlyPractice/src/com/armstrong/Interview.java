package com.armstrong;

import java.util.Scanner;

public class Interview {
	
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string with brackets: ");
		        String input = scanner.nextLine();
		        scanner.close();

		        if (isMatching(input)) {
		            System.out.println("OK");
		        } else {
		            System.out.println("Error");
		        }
		    }

		    public static boolean isMatching(String input) {
		        int count = 0;

		        for (char c : input.toCharArray()) {
		            if (c == '(') {
		                count++;
		            } else if (c == ')') {
		                count--;
		                if (count < 0) {
		                    return false; 
		                }
		            }
		        }

		        return count == 0;
		    }
		}



