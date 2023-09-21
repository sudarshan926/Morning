package com.shape;


public class Squares implements Polygon{

	float side;
	
	public Squares(float s){
		side=s;
	}
	
	public void calcArea() {
		
		float area = side * side; //formula for square area
        System.out.println("Square Area: " + area);
	}

	@Override
	public void calcPeri() {
		
		float perimeter = 4 * side; // formula for Square perimeter
        System.out.println("Square Perimeter: " + perimeter);

	}

}
