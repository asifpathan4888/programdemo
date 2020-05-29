package com.systango.java;

public class SecondLargestArray {
	
	
	public static int getlarge(int[]a,int total){
		
		int temp;
		for(int i=0;i<total;i++){
			
			
			for(int j=i+1;j<total; j++){
				
				if(a[i] > a[j]){
					
					temp=a[i];
					
					a[i]=a[j];
					
					a[j]=temp;
					
				}
			}
		}
		
		
		return a[total-2];
		
	}
	

	public static void main(String[] args) {
		
		int a[]={2,5,6,4,9};
		int b[]={24,22,65,89,78};
		
		System.out.println("Second Largest no is " +getlarge(a, 5));
		
		System.out.println("Second Largest no is  " +getlarge(b, 5));

	}

}
