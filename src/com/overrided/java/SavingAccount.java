package com.overrided.java;

public class SavingAccount extends Account {
	
	public int getbalance (){
		int b= super.getbalance()+10;
		return b;
	}
   
}


