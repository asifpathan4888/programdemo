package com.demo.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterModel {
	public void add(RegisterDTO gs) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asifdemo", "root", "");

		PreparedStatement ps = con.prepareStatement("insert into regdemo values(?,?,?,?,?,?,?,?)");

		ps.setString(1, gs.getFname());
		ps.setString(2, gs.getLname());
		ps.setString(3, gs.getUname());
		ps.setString(4, gs.getEmail());
		ps.setString(5, gs.getAdd());
		ps.setString(6, gs.getPhone());
		ps.setString(7, gs.getGender());
		ps.setString(8, gs.getPassword());

		int i = ps.executeUpdate();
		/*System.out.println(i);
		if(i!=1){
			return true;
		}else{
			return false;
		}*/
		ps.close();
		con.close();
	}

	public boolean Login(String user, String password) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asifdemo", "root", "");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM regdemo where uname=? and pass=?");
		ps.setString(1, user);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();
		boolean t = rs.next();
		ps.close();
		con.close();
		return t;

	}
}
