package com.systango.java;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name= "Asif Khan Pathan";
		
		
		
		
		System.out.println(name.length());
		
		System.out.println(name.indexOf('a'));
		
		System.out.println(name.lastIndexOf('a'));
		
		System.out.println(name.charAt(6));
		
		System.out.println(name.replace('a', '@'));
		
		System.out.println(name.replaceAll("Khan","Singh"));
		
		System.out.println(name);
		
		System.out.println(name.substring(11, 13));
		
		System.out.println(name.concat("3 idiot"));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name);
	}

}
