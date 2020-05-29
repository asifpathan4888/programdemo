package com.systango.java;

public class TestArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sum=0,rem,temp;
		
		int number=9474;
		
		temp=number;
		
		while(number>0){
			
			rem=number%10;
			number=number/10;
			sum+=(rem*rem*rem*rem);
			
		}
		if(temp==sum){
			System.out.println("Armstrong number");
		}else{
			System.out.println("Armstrong number is not");
		}
		
		
	}
	}


