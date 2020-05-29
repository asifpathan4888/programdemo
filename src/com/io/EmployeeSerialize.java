package com.io;

import java.io.Serializable;

public class EmployeeSerialize  implements Serializable{
	
	private String name;
	
	private String address;
	
	private String salary;
	
	
	public EmployeeSerialize(){
		
	}

	public EmployeeSerialize(String name, String address, String salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
