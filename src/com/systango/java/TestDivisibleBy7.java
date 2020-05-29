package com.systango.java;

public class TestDivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=0;
		
		for(int i=100; i<=200; i++){
			
			if(i%7==0)
				result=i;
				
			
			System.out.println("Result is :"+result);
		}

	}

}
