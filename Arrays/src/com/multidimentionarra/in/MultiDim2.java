package com.multidimentionarra.in;

public class MultiDim2 {

	public static void main(String[] args) {
		System.out.println("Using Simple For Loop :");
		int a[][]= {
				{4,5,6,7},
				{9,7,5,4},
				{4,5,6,7},
				{3,5,1,9},
		};
		
		for(int i=0;i<4;i++) { // for rows
			for(int j=0;j<4;j++) {// for column
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("Using inhanced For Loop  :");
			for(int s[]:a) {
				for(int d:s) {
					System.out.print(d+" ");
				}
				System.out.println();
			}
		}

	}


