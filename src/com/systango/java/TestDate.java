package com.systango.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		Date dt= new Date();
		
	 System.out.println(dt);

	 System.out.println(dt.getDate() + "/" +(dt.getMonth()+1));
	 
	 System.out.println(dt.getTime());
	 
	 System.out.println(dt.getDay());
	 
	 SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/YYYY");
	 
	 String dob="25/11/1990" ;
	 
	 System.out.println(sdf.parse(dob));
	 
		
	}

}
