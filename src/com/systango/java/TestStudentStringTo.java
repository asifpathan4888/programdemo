package com.systango.java;

public class TestStudentStringTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStudentToString s[]= new TestStudentToString[3];
		
		s[0] = new TestStudentToString("asif", "bhopal", "007");
		
		s[1] = new TestStudentToString("yoyyo", "ujn","456");
		
		s[2] = new TestStudentToString("raju", "indore", "123");

		for (TestStudentToString ts : s){
			
			System.out.println(ts);
		}
	}

}
