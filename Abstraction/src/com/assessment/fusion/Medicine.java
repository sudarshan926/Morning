package com.assessment.fusion;

abstract class Medicine {
	double price;
    String expiryDate; // class variables
   
   public abstract void displayLabel(); //abstract method

   public Medicine(double p1, String e1) {
       this.price = p1;
       this.expiryDate = e1;// this keyword used  because eliminate the confusion between
       //class variables and methods parameters
   }
   public void getDetails() {
       System.out.println("Price: " + price);
       System.out.println("Expiry Date: " + expiryDate);
   }
   
   
}
class Tablet extends Medicine {        // performed hierarchical inheritance
    public Tablet(double price, String expiryDate) {
        super(price, expiryDate); // super keyword used refer immediately parent class
    }

    @Override
    public void displayLabel() {
        System.out.println("Tablet: Store in a cool dry place");
    }
}


