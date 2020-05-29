package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class UserDataInsert {

	public static void main(String[] args) throws Exception {

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Student Id");
   int StudentId = sc.nextInt();
   
   System.out.println("Enter Student Name");
  
   sc.nextLine();String StudentName = sc.nextLine();
   
   
   System.out.println("Enter Student Roll");
   int StudentRoll = sc.nextInt();
   
   
   Class.forName("com.mysql.jdbc.Driver");
   
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
   
   PreparedStatement ps = (PreparedStatement) con.prepareStatement(" insert into student values (?,?,?)");
   
     ps.setInt(1,StudentId);
     ps.setString(2, StudentName);
     ps.setInt(3, StudentRoll);
     
     int x = ps.executeUpdate();
     
     if(x!=0)
    	 System.out.println("User data inserted.......");
		
     con.close();
	}

}
