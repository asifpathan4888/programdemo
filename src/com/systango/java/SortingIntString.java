package com.systango.java;

public class SortingIntString {

	public static void main(String[] args) {
			String s[]={"10","20","asif","30","khan"};
			
			int sum =0;
			
			for(String st:s){
				
				try{
					sum+=Integer.parseInt(st);
				}catch(NumberFormatException e){
					System.out.println(st);
				}
				System.out.println();
				
				
			}
			System.out.println(sum);	
	}

}
