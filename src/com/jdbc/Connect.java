package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
			public  Connection connectstart() throws Exception{
			 Class.forName("com.mysql.jdbc.Driver");
			    
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/systango", "root", "root");
			return con;    
		}
		
	}
	
	


