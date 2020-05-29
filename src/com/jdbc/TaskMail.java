package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TaskMail {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mail id");
		  String emailid = sc.nextLine();
		    sc.nextLine();
		    
		    System.out.println("Enter Password");
		    String password = sc.nextLine();
		    sc.nextLine();
		    
		    Class.forName("com.mysql.jdbc.Driver");
		    
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
		    
		    PreparedStatement ps = con.prepareStatement("select * from account where emailid=? and password=? ");
		    
		ps.setString(1, emailid);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()){   
		   
		   System.out.println("Do you want to send a mail");
			String s1 = sc.nextLine();
			if (s1.equalsIgnoreCase("yes")) {
				
				System.out.println("Enter Reciever ID");
				String rid = sc.nextLine();
				
				System.out.println("Enter Subject");
				String sub = sc.nextLine();
				
				System.out.println("Enter Message");
				String msg = sc.nextLine();

				PreparedStatement pst = con.prepareStatement("insert into mail(sender,receiver,subject,message) values(?,?,?,?)");
				pst.setString(1, emailid);
				pst.setString(2, rid);
				pst.setString(3, sub);
				pst.setString(4, msg);
				int x11 = pst.executeUpdate();
				if (x11 != 0) 
					System.out.println("Mail sent successfully");
				
			 else 
				System.out.println("LogOut Successfully");
			
		} else {
			System.out.println("Login Fail,Try again");
		
		
		con.close();

		}
		}else{
			System.out.println("Sign in FAil");
	}

}
}
