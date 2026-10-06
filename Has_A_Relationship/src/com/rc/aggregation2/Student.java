package com.rc.aggregation2;

public class Student {
	
	String name;
	long mobileNo;
	String email;
	Address address;
	
	Student(String name,long mobileNo,String email){
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	
	public void register() {
		System.out.println("Student Name: "+this.name);
		System.out.println("Student MobileNo: "+this.mobileNo);
		System.out.println("Student email: "+this.email);
	}
	
	public void addAddress(Address address) {
		this.address = address;
	}

}
