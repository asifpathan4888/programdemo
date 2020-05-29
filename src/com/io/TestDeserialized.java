package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestDeserialized {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fi= new FileInputStream("D:/Employeedata.ser");
		
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		EmployeeSerialize o = (EmployeeSerialize) oi.readObject();
		
		System.out.println(o.getName()+" "+o.getAddress()+" "+o.getSalary()+" ");
		

	}

}
