package com.rc.runtimepolymorphism4;

public class Product {
	
	int id;
	String brand;
	
	Product(int id,String brand){
		this.id=id;
		this.brand=brand;
	}
	
	public void displayProductDetails() {
		System.out.println("Product id: "+this.id);
		System.out.println("Product brand: "+this.brand);
	}

}
