package com.rc.aggregation;

public class Bag {
	
	String brand;
	String color;
	double price;
	
	Book book;
	
	Bag(String brand,String color,double price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void displayBagDetails() {
		System.out.println("Bag Name: "+this.brand);
		System.out.println("Bag Color: "+this.color);
		System.out.println("Bag Price: "+this.price);
	}
	
	public void insertBook(Book book) {
		this.book=book;
	}

	

}
