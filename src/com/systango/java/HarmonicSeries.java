package com.systango.java;

public class HarmonicSeries {

	public static void main(String[] args) {
		int num=50;
		
		double result = 0.0;
		while(num >=5){
			result = result + (double) 1 / num;
			num--;
		}
		System.out.println("Output of Harmonic Series is "+result);
	}

}
