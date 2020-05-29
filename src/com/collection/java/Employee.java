package com.collection.java;

public class Employee implements Comparable<Employee> {

	private String name;

	private String empId;

	private String department;

	private String age;

	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public String getDepartment() {
		return department;
	}

	public String getAge() {
		return age;
	}

	public Employee() {

	}

	public Employee(String name, String empId, String department, String age) {
		super();
		this.name = name;
		this.empId = empId;
		this.department = department;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + empId + " " + department + " " + age + " ";

	}

	@Override
	public int compareTo(Employee o) {
		return this.getEmpId().compareTo(o.getEmpId());

	}

}
