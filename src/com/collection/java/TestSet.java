package com.collection.java;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		
		
		HashSet hs= new HashSet();
		
		hs.add("Akash");
		hs.add("vikas");
		hs.add("jhakas");
		hs.add("345");
    //System.out.println(hs);
    
    Iterator it = hs.iterator();
    
    while(it.hasNext()){
    	System.out.println(it.next());
    	
    	if(it.next().equals("Akash")){
    		it.remove();
    	}
    }
    System.out.println(hs);
	}

}
