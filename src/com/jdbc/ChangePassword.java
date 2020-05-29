package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your E-mail id");
			String eid = sc.nextLine();
			System.out.println("Enter your new password");
			String pwd = sc.nextLine();

			Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
			PreparedStatement ps = con.prepareStatement("update account set password=? where emailid=?");
			ps.setString(1, pwd);
			ps.setString(2, eid);
			int x = ps.executeUpdate();
			if (x != 0) {
				System.out.println("Your password changed successfully");
			} else {
				System.out.println("enter correct email id ");
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Enter correct Email-id");
		}
	}
}

