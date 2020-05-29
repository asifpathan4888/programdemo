package com.systango.java;

public class TestStringtoAscii {

	public static void main(String[] args) {

		String test = "ASIF KHAN";
		
	     for ( int i = 0; i < test.length(); i++ ) {
	    	 
	       char c = test.charAt( i );
	       
	       int j = (int) c;

	       System.out.println(j);
	       }
	}

}
