package com.assessment.fusion;


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
