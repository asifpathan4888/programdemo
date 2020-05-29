package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {

	public static void main(String[] args) {

		Employee e[]=new Employee[4];
		
		e[0]=new Employee("Asif","ca153d08","HR","25");
		
		e[1]=new Employee("Wasim","ca153d09","Tester","28");
		
		e[2]=new Employee("Bashu","ca153d25","Developer","21");
		
		e[3]=new Employee("zen","ca153d08","HR","25");
		
		ArrayList<Employee> emps= new ArrayList<Employee>();
		
		for(int i=0; i<4; i++){
			emps.add(e[i]);
			
		}
		
		
		Collections.sort(emps);
		System.out.println("Name Id  Dept. Age");
		
		for(Employee el : emps){
			System.out.println(el);
		}
	}
	

}
