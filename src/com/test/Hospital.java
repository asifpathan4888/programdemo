package com.test;

public class Hospital  extends Patient{
	
	private String hospitalId;
	private String name;
	private String address;
	private String specialities;
	private String contactdetails;

	private Boolean genralwardavailablity;
	private Boolean privateroomavailablity;
	private String perdaycharges;
	
	
	public Hospital(){
		
		
	}
	
	
	
	public Hospital(String hospitalId, String name, String address, String specialities, String contactdetails,
			Boolean genralwardavailablity, Boolean privateroomavailablity, String perdaycharges) {
		super();
		this.hospitalId = hospitalId;
		this.name = name;
		this.address = address;
		this.specialities = specialities;
		this.contactdetails = contactdetails;
		this.genralwardavailablity = genralwardavailablity;
		this.privateroomavailablity = privateroomavailablity;
		this.perdaycharges = perdaycharges;
	}
	public String getHospitalId() {
		return hospitalId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getSpecialities() {
		return specialities;
	}
	public String getContactdetails() {
		return contactdetails;
	}
	public Boolean getGenralwardavailablity() {
		return genralwardavailablity;
	}
	public Boolean getPrivateroomavailablity() {
		return privateroomavailablity;
	}
	public String getPerdaycharges() {
		return perdaycharges;
	}
	
	
}
