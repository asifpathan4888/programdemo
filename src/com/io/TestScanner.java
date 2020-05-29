package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws Exception {

		
		FileReader fr = new FileReader("D://yoyo.txt");
		
		Scanner sc= new Scanner(fr);
		
		while(sc.hasNext()){
			
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
