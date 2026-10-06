package com.rc.composition2;

public class Pen {
	
	String brand;
	double price;
	String type;
	
	Ink ink;
	
	Pen(String brand,double price,String type){
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	public void displayPenDetails() {
		System.out.println("Pen Brand: "+this.brand);
		System.out.println("Price: "+this.price);
		System.out.println("Pen Type: "+this.type);
	}
	
	{
		this.ink = new Ink("Black",2.5);
	}

}
