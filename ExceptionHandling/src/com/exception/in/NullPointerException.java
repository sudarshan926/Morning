package com.exception.in;

import java.util.Scanner;

public class NullPointerException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		try {
			a=Integer.parseInt(null);
			a=Integer.parseInt("");
			// parse int method used for converting string to int
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
