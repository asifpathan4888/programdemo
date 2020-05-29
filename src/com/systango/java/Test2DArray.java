package com.systango.java;

public class Test2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] [] = { {10,11,12,13,14,15} ,
				{20,22,23,26},
				{56,89,78,78,56,45,67} };
		
		for (int i=0; i<ar.length; i++) {
			for (int j=0; j< ar[i].length; j++){
				System.out.print(" " + ar[i] [j]);
			}
		
			System.out.println();
		}
		
		
		
	}

}
