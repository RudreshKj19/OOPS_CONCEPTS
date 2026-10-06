package com.rc.aggregation2;

public class Address {
	
	String city;
	int pincode;
	
	Address(String city,int pincode){
		this.city = city;
		this.pincode = pincode;
	}
	
	public void cityDetails() {
		System.out.println("City: "+this.city);
		System.out.println("Pincode: "+this.pincode);
	}

}
