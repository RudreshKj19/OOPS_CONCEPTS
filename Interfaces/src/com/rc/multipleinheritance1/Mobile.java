package com.rc.multipleinheritance1;

public class Mobile implements Product,Electronics {
	
	double price;
	String brand;
	
	Mobile(double price){
		this.price=price;
	}
	
	Mobile(double price,String brand){
		this(price);
		this.brand=brand;
	}
	@Override
	public void buyProduct() {
		System.out.println("buying mobile,..");
	}
	
	@Override
	public void switchOn() {
		System.out.println("switchOn the Mobile");
	}
	@Override
	public void switchOff() {
		System.out.println("switch off the mobile");
	}
	
	public void displayMobileDetails() {
		System.out.println("Mobile Price: "+this.price);
		System.out.println("Mobile Brand: "+this.brand);
	}

}
