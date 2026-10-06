package com.rc.composition2;

public class Ink {
	
	String color;
	double quantity;
	
	Ink(String color,double quantity){
		this.color = color;
		this.quantity = quantity;
	}
	
	public void InkDetails() {
		System.out.println("Color: "+this.color);
		System.out.println("Quantity: "+this.quantity);
	}

}
