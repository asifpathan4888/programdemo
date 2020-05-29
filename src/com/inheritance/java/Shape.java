package com.inheritance.java;

public class Shape {
	
	private String color;
	private String borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(String borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	
	public double area(){
		System.out.println("Area of shape");
		return 0;
	}

	
}

