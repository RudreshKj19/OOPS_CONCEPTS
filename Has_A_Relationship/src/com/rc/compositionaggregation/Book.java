package com.rc.compositionaggregation;

public class Book {
	
	String brand;
	double price;
	String type;
	
	Book(String brand,double price,String type){
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	public void displayBookDetails() {
		System.out.println("Book brand: "+this.brand);
		System.out.println("Book Price: "+this.price);
		System.out.println("Book type: "+this.type);
	}

}
