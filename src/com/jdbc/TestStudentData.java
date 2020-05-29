package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestStudentData {

	public static void main(String[] args) throws Exception {

		 Class.forName("com.mysql.jdbc.Driver");
		   
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
		    
		    
		    PreparedStatement  ps= con.prepareStatement("SELECT s.sid,s.sname,sd.mobile,sd.address FROM studentdata s,studentdetail sd WHERE s.`sid`=sd.`sid`;");
        	    	
        	ResultSet rs = ps.executeQuery();
        	
        	System.out.println("ID \t S_NAME\t S_MOBILE\t S_ADDRESS");
    		while (rs.next()) {
    			System.out.print(rs.getInt(1)+" \t");
    			System.out.print(" "+rs.getString(2)+" \t");
    			System.out.print(" "+rs.getInt(3)+" \t");
    			System.out.println(" "+rs.getString(4)+" \t");
    		}
        	con.close();
        	
	}

}
