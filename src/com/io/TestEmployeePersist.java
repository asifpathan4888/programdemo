package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.collection.java.Employee;

public class TestEmployeePersist {

	public static void main(String[] args) throws IOException {

		EmployeeSerialize e = new EmployeeSerialize("Sachin","Bhopal","253650");
		
		FileOutputStream fo= new FileOutputStream("D:/Employeedata.ser");
		
		ObjectOutputStream os=new ObjectOutputStream(fo);
		
		os.writeObject(e);
		
		os.close();
		
		fo.close();
		
		System.out.println("Employee data successfully ");
		
		
		
	}

}
