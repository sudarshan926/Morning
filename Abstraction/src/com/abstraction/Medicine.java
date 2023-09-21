package com.abstraction;

abstract class Medicine {
	int price;
	String ExpireDate;
	abstract void getDetails();
	
}

class Tablet extends Medicine {

	@Override
	void getDetails() {
		price=2345;
		ExpireDate="23/3/2024";
		System.out.println("manufactured by a pharmaceutical company "+price);
		
	}

class Syrup extends Tablet{
	
}

class Ointment extends Syrup{
	
}


	public static void main(String[] args) {
		
	}

	
}

