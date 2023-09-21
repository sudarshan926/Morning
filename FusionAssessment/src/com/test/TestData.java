package com.test;

import com.shape.Rectangles;
import com.shape.Squares;

public class TestData {

	public static void main(String[] args) {
		Squares s=new Squares(20.6f);
		
		s.calcArea();
		s.calcPeri();
		
		Rectangles r=new Rectangles(20.06f,39.09f);
		r.calcArea();
		r.calcPeri();
		
		
		/*
		 * SquareArea=side*side;
		 *  SquareParemeter=4*side 
		 *  RectangleArea=length*breadth;
		 * RectanglePerimeter=2(length*breadth);
		 */

	}

}
