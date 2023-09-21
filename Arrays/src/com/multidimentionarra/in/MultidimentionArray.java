package com.multidimentionarra.in;

public class MultidimentionArray {

	public static void main(String[] args) {

		int m[][]= {
				{1,2,3},
				{4,6,7},
				{8,4,3}
				};
		System.out.println("Using For each loop: ");
		for(int k[]:m) {
			for(int j:k) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
