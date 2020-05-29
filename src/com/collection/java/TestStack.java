package com.collection.java;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.push("ali");
		
		st.push("sys");
		
		st.push("james");
		
		System.out.println(st);
		
		st.pop();
		
		System.out.println(st.peek());
		
		st.add("aman");
		st.add("varun");
		
		System.out.println(st);

	}

}
