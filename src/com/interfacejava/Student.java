package com.interfacejava;

public class Student extends Person implements Socialworker {
	private String rollno;
	private String classname;
	
	
	
	
	public Student(){
		
	}
	
	

	public Student(String name,String address,String age,String rollno, String classname) {
		super(name,address,age);
		this.rollno = rollno;
		this.classname = classname;
	}



	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}



	public void helptoothers() {
		
		System.out.println("Student help by old books");
		// TODO Auto-generated method stub
		
	}
	

}
