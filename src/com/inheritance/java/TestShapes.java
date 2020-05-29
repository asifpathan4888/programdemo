package com.inheritance.java;

public class TestShapes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle();
		r.setColor("red");
		r.setBorderwidth("1");
		r.setLength(12);
		r.setBreadth(12);
		r.area();
		
		
		Triangle t=new Triangle();
		t.setColor("yellow");
		t.setBorderwidth("2");
		t.setBase(10);
		t.setHeight(2);
		t.area();
		
		
		Circle c=new Circle();
		c.setColor("white");
		c.setBorderwidth("3");
		c.setRadius(20);
		c.area();
		
		
		
		System.out.println("Rectagle iz: " + r.getColor());
		System.out.println(r.getBorderwidth());
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
        System.out.println(r.area());
        
        System.out.println("_________________________________________________________-");
        
        
        
        System.out.println("Circle iz: " + c.getColor());
        System.out.println(c.getBorderwidth());
        System.out.println(c.getRadius());
        System.out.println(c.area());
        
        System.out.println("____________________________________________________________");
        
        
        System.out.println("Triangle iz: " +t.getColor());
        System.out.println(t.getBorderwidth());
        System.out.println(t.getBase());
        System.out.println(t.getHeight());
        System.out.println(t.area());
        
	}

}
