package com.exception.in;

import java.util.Scanner;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {

		try {
			int arr[]= {3,5,6,3,4};
			System.out.println(arr[21]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Catched "+e);
			System.out.println("Only catched not resolve");
		}

	}

}
