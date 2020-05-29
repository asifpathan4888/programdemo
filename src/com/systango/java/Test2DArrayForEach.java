package com.systango.java;

public class Test2DArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ar[] [] = { {10,11,12,13,14,15} ,
				{20,22,23,26},
				{56,89,78,78,56,45,67} };
		
		for(int rr [] : ar) {
			
			for(int r:rr){
				
				System.out.print(" " + r);
			}
			System.out.println();
		}

	}

}
