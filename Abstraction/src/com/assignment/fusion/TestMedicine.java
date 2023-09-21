package com.assignment.fusion;

import java.util.Random;
import java.util.Scanner;



abstract class Medicine {
     double price;
     String expiryDate;
    
    public abstract void displayLabel();

    public Medicine(double p1, String e1) {
        this.price = p1;
        this.expiryDate = e1;// this keyword used here because referred current class instance
        // variables
    }

    public void getDetails() {
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
    }

    
}

class Tablet extends Medicine {
    public Tablet(double price, String expiryDate) {
        super(price, expiryDate);
    }

    @Override
    public void displayLabel() {
        System.out.println("Tablet: Store in a cool dry place");
    }
}
class Syrup extends Medicine {
    public Syrup(double price, String expiryDate) {
        super(price, expiryDate);
    }

    @Override
    public void displayLabel() {
        System.out.println("Syrup: Shake well before use");
    }
}

class Ointment extends Medicine {
    public Ointment(double price, String expiryDate) {
        super(price, expiryDate);
    }

    @Override
    public void displayLabel() {
        System.out.println("Ointment: For external use only");
    }
}

public class TestMedicine {
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Given user from Price and Expire Date");
    	System.out.println("Price :");
    	double price=sc.nextDouble();
    	System.out.println("ExpiryDate :");
    	Scanner sc1=new Scanner(System.in);
    	String expiryDate=sc1.nextLine();
    	
        Random r1 = new Random(); //Created Random class because we can take any random medicines
        Medicine[] medicines = new Medicine[5];

        for (int i = 0; i < medicines.length; i++) {
         int randomMedicines = r1.nextInt(3)+1; 


            switch (randomMedicines) {
                case 1:
                    medicines[i] = new Tablet(price, expiryDate);
                    break;
                case 2:
                    medicines[i] = new Syrup(price, expiryDate);
                    break;
                case 3:
                    medicines[i] = new Ointment(price, expiryDate);
                    break;
            }
        }

        for (Medicine med : medicines) {
           med.getDetails();
           med.displayLabel();
            System.out.println("----------------------------------");
        }
    }
}

