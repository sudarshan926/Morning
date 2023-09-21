package com.nestedexception.in;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {

			try {
				int a = 10 / 0;
				System.out.println(a);
			} catch (ArithmeticException ex) {
				System.out.println("Can't devide by zero");
			}
			try {
				int arr[] = { 22, 3, 3, 44, 55, 66 };
				System.out.println(arr[44]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index OutOf Bound");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
