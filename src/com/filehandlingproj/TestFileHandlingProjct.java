package com.filehandlingproj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileHandlingProjct {

	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("                                     WELCOME TO FILE HANDLING PROJECT");

		
		System.out.println("ENTER 1 READING A FILE");
		
		System.out.println("ENTER 2 WRITE DATA TO A FILE");
		
		System.out.println("ENTER 3 COPY ANY FILE");
		
		System.out.println("ENTER 4 COPY IMAGE");
		
		System.out.println("ENTER 5 CALULATOR");
		
		System.out.println("ENTER 6 BREAK FILE DATA IN PARAGRAPHS ");
		
		System.out.println("ENTER 7 EXIT");
		
		
	int number=7;
	
	
          switch (number){
          
          case 1:
        	  System.out.println("PLEASE ENTER COMPLETE PATH OF FILE");
        	  
        	  Scanner ss=new Scanner(System.in);
    		  String path =ss.next();
    		  
    		  FileReader fr = new FileReader(path);
    		  
    		    Scanner sc = new Scanner(fr);
    		    while (sc.hasNext()) {
    		      String str = sc.nextLine();
    		      System.out.println(str);
    		    }
    		    sc.close();
    		    break;
    		    
         
    		
 
          case 2:
        	 
 
          }
 
 
 
 }


}
