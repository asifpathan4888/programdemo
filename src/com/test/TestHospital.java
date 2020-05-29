package com.test;



public class TestHospital {
	public static void main(String[] args) {
		
		Hospital h = new Hospital("101","CHL","indore","Heart Specialist","0731 4050123",null, null, "2500");
		
		System.out.println("HOSPITAL DETAILS");
		System.out.println(h.getHospitalId());
		System.out.println(h.getName());
		System.out.println(h.getAddress());
		System.out.println(h.getSpecialities());
		System.out.println(h.getContactdetails());
		System.out.println(h.getGenralwardavailablity());
		System.out.println(h.getPrivateroomavailablity());
		System.out.println(h.getPerdaycharges());
		
		System.out.println("_________________________________________________________________________________________________");
		
	

	Patient p= new Patient("Ashu","Nasir Khan","Ujjain", "4055453","Sprain","xyz");
	System.out.println("PATIENT DETAILS");
	System.out.println(p.getName());
	System.out.println(p.getFathername());
	System.out.println(p.getAddress());
	System.out.println(p.getContact());
	System.out.println(p.getDisease());
	System.out.println(p.getDaysoccupancy());
	
	System.out.println("______________________________________________________________________________________________-");
	
}
}
