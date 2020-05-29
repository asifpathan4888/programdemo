package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestCallableStatement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  
		   Class.forName("com.mysql.jdbc.Driver");
		   
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");

		    CallableStatement cs = con.prepareCall("{call getcityname(?,?)}");
		    
		    int cityid= 3;
		    
		    cs.setInt(1, cityid);
		    
		    cs.registerOutParameter(2, java.sql.Types.VARCHAR);
		    
		    cs.execute();
		    
		    String cityname= cs.getString(2);
		    
		    System.out.println("CityName from Stored Procedure=" +cityname);
		    
		    con.close();
	}

}
