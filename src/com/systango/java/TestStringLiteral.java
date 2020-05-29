package com.systango.java;

public class TestStringLiteral {

	public static void main(String[] args) {

		String s="hello";
		String s2="Hello";
		
		String str=new String("java");
		String str2=new String("java");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		//System.out.println(s==s2);
	}

}
