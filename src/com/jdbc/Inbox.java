package com.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Inbox {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Id");
		String uid = sc.nextLine();
		System.out.println("Enter Password");
		String pwd = sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from account where emailid=? and password=?");
			ps.setString(1, uid);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Login Successfull");
				PreparedStatement ps1 = con.prepareStatement("select * from mail where receiver=?");
				PreparedStatement ps2 = con.prepareStatement("select COUNT(receiver) FROM mail where receiver=?");
				ps2.setString(1, uid);
				ps1.setString(1, uid);
				ResultSet rs2 = ps2.executeQuery();
				rs2.next();
				System.out.println("You have " + rs2.getInt(1) + " unread E-MAILS");
				ResultSet rs1 = ps1.executeQuery();
				System.out.println("Here are your E-mails");
				int i = 1;
				while (rs1.next()) {
					System.out.println("your " + i + "st email is\n " + rs1.getString("message"));
					i++;
				}
			} else {
				System.out.println("Login Fails , Try again");

			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}