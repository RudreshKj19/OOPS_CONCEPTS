package com.rc.aggregation1;

public class Sim {
	String name;
	double price;
	
	Sim(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	public void displaySimDetails() {
		System.out.println("Sim Name: "+this.name);
		System.out.println("Sim Price: "+this.price);
	}

}
