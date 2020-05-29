package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class BankTransaction {

	public static void main(String[] args) throws Exception {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter account number");
		 int accountno=sc.nextInt();
		 
		 System.out.println("enter name");
		 String name=sc.nextLine();
		 sc.nextLine();
		
		 System.out.println("enter balance");
		 int balance=sc.nextInt();
		
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
		   
		  // PreparedStatement ps = (PreparedStatement) con.prepareStatement(" insert into bank values (?,?,?)");
		   
		   PreparedStatement ps = (PreparedStatement) con.prepareStatement(" update bank set balance=balance-? where acno=?");
		   
		   PreparedStatement ps2 = (PreparedStatement) con.prepareStatement(" update bank set balance=balance+? where acno=?");
		   
		   ps.setInt(1, 200);
		   ps.setInt(2,101);
		   
		   ps2.setInt(1, 200);
		   ps2.setInt(2, 102);
		   
		   con.setAutoCommit(false);
		   
		   ps.executeUpdate();
		   ps2.executeUpdate();
		   
		   
		   con.commit();
		   
		   
		   
		     //ps.setString(1,accountno);
		     //ps.setString(2, name);
		     //ps.setString(3, balance);
		     
		     int x = ps.executeUpdate();
		     
		     if(x!=0)
		    	 System.out.println("Bank data updated.......");
				
		     con.close();
		
	}

}
