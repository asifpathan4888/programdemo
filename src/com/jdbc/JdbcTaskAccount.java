package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcTaskAccount {

	public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
   
    
    System.out.println("Enter Name");
    String name = sc.nextLine();
    sc.nextLine();
    
    System.out.println("Enter Email Id");
    String emailid = sc.nextLine();
    sc.nextLine();
    
    System.out.println("Enter Password");
    String password = sc.nextLine();
    sc.nextLine();
    
  
    
    
    //Connect cn = new Connect();
    //Connection con = cn.connectstart();
    
    
   Class.forName("com.mysql.jdbc.Driver");
   
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
    
    PreparedStatement ps = con.prepareStatement("insert into  account (name,emailid,password) values (?,?,?) ");
    
    
    ps.setString(1, name);
    ps.setString(2,emailid);
    ps.setString(3, password);
    
    int x = ps.executeUpdate();
    

    if(x!=0)
    	System.out.println("account created succesfully");
    
    else
    	System.out.println("account not created please try again");
    
    con.close();
    
    
    
    
    
	}

}
