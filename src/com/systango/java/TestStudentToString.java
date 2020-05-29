package com.systango.java;

public class TestStudentToString {

	


		private String name;
		private String address;
		private String rollno;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		
		
		public TestStudentToString() {
			
		}
		
		
		public TestStudentToString(String name, String address, String rollno) {
			super();
			this.name = name;
			this.address = address;
			this.rollno = rollno;
		}
		@Override
		public String toString() {
		
			return name + " " + address + " " + rollno;
		}
		
		

}
