package com.inheritance.java;

public class Rectangle extends Shape {

	private int Length;
	private int breadth;
	
	
	
	
	
	public int getLength() {
		return Length;
	}





	public void setLength(int length) {
		Length = length;
	}





	public int getBreadth() {
		return breadth;
	}





	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}





	public double area(){
		return Length*breadth;
		
		
	}

}
