package com.overrided.java;

public class TestAccount  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a =new Account();
		Account sa=new SavingAccount();
		SavingAccount saa = new SavingAccount();
		
		System.out.println(a.getbalance());
		
		System.out.println(sa.getbalance());
		
		System.out.println(saa.getbalance());

	}

}
