package com.systango.java;

public class TestReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n=12345;
		int reverse=0;
		int temp=0;
		
		while(n>0){
			
			temp=n%10;
			
			reverse=reverse*10+temp;
			n=n/10;
			
		}
		
		System.out.println("reversed number is " +reverse);
		
	}


		
	}


