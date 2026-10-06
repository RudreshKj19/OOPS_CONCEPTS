package com.rc.composition;

public class Engine {
	int cc;
	String fuelType;
	
	Engine(int cc,String fuelType){
		this.cc = cc;
		this.fuelType = fuelType;
	}
	
	public void displayDetails() {
		System.out.println("Engine CC: "+this.cc);
		System.out.println("Engine Type: "+this.fuelType);
	}

}
