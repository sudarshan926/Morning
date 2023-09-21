package com.armstrong;

import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] srNo = new int[10];
        String[] names = new String[10];
        int[] mathsMarks = new int[10];
        int[] geographyMarks = new int[10];
        int[] marathiMarks = new int[10];
        
        // Accept user inputs for 10 students
        for (int i = 0; i < 10; i++) {
            srNo[i] = i+1;
            System.out.print("Enter name of student " + srNo[i] + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter Maths marks for " + names[i] + ": ");
            mathsMarks[i] = sc.nextInt();
            System.out.print("Enter Geography marks for " + names[i] + ": ");
            geographyMarks[i] = sc.nextInt();
            System.out.print("Enter Marathi marks for " + names[i] + ": ");
            marathiMarks[i] = sc.nextInt();
            sc.nextLine(); // Consume the newline character
        }
        
        // Print the header
        System.out.println("\nSr. No\tName\tMaths\tGeography\tMarathi");
        System.out.println("=========================================");
        
        // Print the student information
        for (int i = 0; i < 10; i++) {
            System.out.println(srNo[i] + "\t" + names[i] + "\t" + mathsMarks[i] + "\t" + geographyMarks[i] + "\t\t" + marathiMarks[i]);
        }
        
        // Calculate and print summary
        int above35Maths = 0;
        int above35Marathi = 0;
        int highestGeographyMarks = Integer.MIN_VALUE;
        String highestGeographyName = "";
        int lowestMarathiMarks = Integer.MAX_VALUE;
        String lowestMarathiNames = "";

        for (int i = 0; i < 10; i++) {
            if (mathsMarks[i] > 35) {
                above35Maths++;
            }
            if (marathiMarks[i] > 35) {
                above35Marathi++;
            }
            if (geographyMarks[i] > highestGeographyMarks) {
                highestGeographyMarks = geographyMarks[i];
                highestGeographyName = names[i];
            }
            if (marathiMarks[i] < lowestMarathiMarks) {
                lowestMarathiMarks = marathiMarks[i];
                lowestMarathiNames = names[i];
            } else if (marathiMarks[i] == lowestMarathiMarks) {
                lowestMarathiNames += ", " + names[i];
            }
        }

        System.out.println("\nSummary Report:");
        System.out.println("a. Number of students above 35 Marks in Maths: " + above35Maths);
        System.out.println("b. Number of students above 35 Marks in Marathi: " + above35Marathi);
        System.out.println("c. Name of Student with highest Marks in Geography: " + highestGeographyName + " (Marks: " + highestGeographyMarks + ")");
        System.out.println("d. Name(s) of Student(s) with lowest Marks in Marathi: " + lowestMarathiNames + " (Marks: " + lowestMarathiMarks + ")");
    }
}