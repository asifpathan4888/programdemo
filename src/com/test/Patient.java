package com.test;

public class Patient {

	private String name;
	private String fathername;
	private String address;
	private String contact;
	private String disease;
	private String daysoccupancy;
	
	public Patient(){
		
	}
	
	public Patient(String name, String fathername, String address, String contact, String disease,
			String daysoccupancy) {
		super();
		this.name = name;
		this.fathername = fathername;
		this.address = address;
		this.contact = contact;
		this.disease = disease;
		this.daysoccupancy = daysoccupancy;
	}
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public String getFathername() {
		return fathername;
	}
	public String getAddress() {
		return address;
	}
	public String getContact() {
		return contact;
	}
	public String getDisease() {
		return disease;
	}
	public String getDaysoccupancy() {
		return daysoccupancy;
	}
	
	
}
