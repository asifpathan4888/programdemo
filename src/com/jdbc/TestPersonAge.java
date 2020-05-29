package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;

public class TestPersonAge {

	public static void main(String[] args) throws Exception {
		
		   Class.forName("com.mysql.jdbc.Driver");
		   
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");

		    CallableStatement cs = con.prepareCall("{call getpersonage(?,?)}");
		    
		    
		    int pid= 3;
		    
		    cs.setInt(1, pid);
		    
		    
		    cs.registerOutParameter(2, java.sql.Types.INTEGER);
		    
		    cs.execute();
		    
		    int age= cs.getInt(2);
		    
 System.out.println("Person Age from Stored Procedure=" +age);
		    
		    
		    
 con.close();
	}

}
