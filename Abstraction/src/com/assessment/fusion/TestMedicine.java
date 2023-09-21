package com.assessment.fusion;

import java.util.Random;
import java.util.Scanner;

public class TestMedicine {
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Given user from Price and Expire Date");
    	System.out.println("Price :");
    	double price=sc.nextDouble();
    	System.out.println("ExpiryDate :");
    	Scanner sc1=new Scanner(System.in);
    	String expiryDate=sc1.nextLine();
    
        Random r1 = new Random(); //Created Random class because we can take any random value
		Medicine[] medicines = new Medicine[5];

        for (int i = 0; i < medicines.length; i++) {
         int randomMedicines = r1.nextInt(3)+1; //

            switch (randomMedicines) { //used switch statement because check the condition and 
            						   //execute  case
                case 1:
                    medicines[i] = new Tablet(price, expiryDate);
                    break;
                case 2:
                    medicines[i] = new Syrup(price, expiryDate);
                    break;
                case 3:
                    medicines[i] = new Ointment(price, expiryDate);
                    break;
                    
                  default:System.out.println("Not matched");
                  //when not satisfy any case then execute default
            }
        }

        for (Medicine med : medicines) {  //used for each or enhanced for loop
           med.getDetails();
           med.displayLabel();
            System.out.println("--------------------------------------");
        }
    }
}