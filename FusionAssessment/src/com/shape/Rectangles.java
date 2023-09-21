package com.shape;

public class Rectangles implements Polygon{
   
	
	float length;
	float breadth;
	
	public Rectangles(float l, float b){
		length=l;
		breadth= b;
	}
	
	public void calcArea() {
		float area = length * breadth; // formula for rectangle area
        System.out.println("Rectangle Area: " + area);
		
		
	}

	@Override
	public void calcPeri() {
		float perimeter = 2 * (length + breadth); // formula for Rectangle Perimeter
        System.out.println("Rectangle Perimeter: " + perimeter);
		
	}
}
