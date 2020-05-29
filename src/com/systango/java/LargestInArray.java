package com.systango.java;

public class LargestInArray {
	
	public static int getlarge(int[] a,int total){
		
		int temp;
		
		for(int i=0; i<total; i++){
			
			for(int j=i+1; j<total; j++){
				if(a[i] > a[j]){
					
					temp=a[i];
					
					a[i]=a[j];
					
					a[j]=temp;
				}
				
			}
		}
		return  a[total-1];
		
	}
	
	
	public static void main(String[] args) {

		int a[]={1,5,7,8,9,3,6};
		
		int b[]={44,45,98,67,76,40};
		
		System.out.println("LARGEST "+getlarge(a, 7));
		
		System.out.println("LARGEST "+getlarge(b, 6));
	}

}
