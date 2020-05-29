package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) throws Exception {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your eid: ");
		int eid = scanner.nextInt();

		System.out.print("Enter your ename: ");
		String ename = scanner.nextLine();
		scanner.nextLine();
		
		System.out.print("Enter your salary: ");
		double salary = scanner.nextDouble();
		
		 	
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
		
		PreparedStatement  ps= con.prepareStatement("insert into employee "
				+ " (eid, ename, salary)" + " values (?, ?, ?)");
		
		ps.setInt(1, eid);
		ps.setString(2, ename);
		ps.setDouble(3, salary);
		
	
		
		 int x=ps.executeUpdate();//no of row affected
		
		if(x!=0)
			System.out.println(" user data inserted..........");
		
		con.close();
		
	}
}
