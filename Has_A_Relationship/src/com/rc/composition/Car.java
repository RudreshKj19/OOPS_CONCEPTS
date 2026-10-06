package com.rc.composition;

public class Car {

	String brand;
	String color;
	double price;
	
	Engine engine;

	Car(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public void displayCarDetails() {
		System.out.println("Car Brand: " + this.brand);
		System.out.println("Car Color: " + this.color);
		System.out.println("Car price: " + this.price);
	}
	
	{
		this.engine = new Engine(800,"Petrol");
	}

}
