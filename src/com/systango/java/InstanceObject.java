
package com.systango.java;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class InstanceObject {

	
	
	public void add() {
		System.out.println("This is add method");
		
	}
	
	public void sum (int a ,int b) {
		System.out.println("sum : " +(a+b));
	}
	
	public int subt ( int x,int y) {
		return x-y;
	}
		public int mult () {
			return 20*5;
			}
		public static void main(String[] args) {
			
			InstanceObject iobj=new InstanceObject();
			
			System.out.println("subtraction :"+iobj.subt(430,20));
			
			iobj.add();
			
			iobj.sum(40, 50);
			
			System.out.println("multiplication :"+iobj.mult());
		}
		
	
	}

	

