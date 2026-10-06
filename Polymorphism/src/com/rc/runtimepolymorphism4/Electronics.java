package com.rc.runtimepolymorphism4;

public class Electronics extends Product {
	String type;
	
	Electronics(int id,String brand,String type){
		super(id,brand);
		this.type=type;
	}
	
	@Override
	public void displayProductDetails() {
		System.out.println("Electronincs id: "+this.id);
		System.out.println("Electronincs brand: "+this.brand);
		System.out.println("Electronics type: "+this.type);
	}
	
	public void switchOn() {
		System.out.println("Switch on the product");
	}
	public void switchOff() {
		System.out.println("Switch off the product");
	}
	
	

}
