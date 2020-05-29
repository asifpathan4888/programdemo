package com.interfacejava;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Businessman bm =new Businessman("business", "rafiq", "ujjain", "27");
		
		System.out.println(bm.getName());
		
		System.out.println(bm.getAddress());
		
		System.out.println(bm.getAge());
		
		System.out.println(bm.getBusiness());
		
		bm.earnmoney();
		
		bm.donation();
		
		bm.helptoothers();
		
		System.out.println("__________________________________________________________________");

		
		
		Student st=new Student("raju", "indore", "20", "123", "bca");
		
		System.out.println(st.getName());
		
		System.out.println(st.getAddress());
		
		System.out.println(st.getAge());
		
		System.out.println(st.getClassname());
		
		System.out.println(st.getRollno());
		
		st.helptoothers();
		
		System.out.println("_________________________________________________________________");
		
		
		
		
		Richman rm=new Businessman();
		rm.donation();
		rm.earmoney();
		rm.helptoothers();
	}

}
