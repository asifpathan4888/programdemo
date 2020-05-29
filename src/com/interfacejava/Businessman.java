package com.interfacejava;

public class Businessman  extends Person implements Richman {
	
	
	
	private String Business;
	
	public Businessman(){
		
	}
	
	
	

	public Businessman(String business,String name,String address,String age) {
		super(name,address,age);
		Business = business;
	}




	public String getBusiness() {
		return Business;
	}

	public void setBusiness(String business) {
		Business = business;
	}
	
	
	
	public void Party(){
		System.out.println("Businessman give party 5 lac");
	}

	
	public void earnmoney(){
		System.out.println("Businessman earn 50k crore");
	}
	
	public void donation(){
		System.out.println("Busniessman donation 50 lac");
	}




	public void helptoothers() {
	
	System.out.println("Businessman by charity trust");
		
	}




	
	public void party() {
		// TODO Auto-generated method stub
		
	}




	
	public void earmoney() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}

