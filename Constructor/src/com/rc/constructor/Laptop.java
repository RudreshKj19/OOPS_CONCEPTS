package com.rc.constructor;

public class Laptop {

	String brand;
	double price;
	String processor;
	int ram;
	int storage;

	Laptop(String brand, double price, String processor, int ram, int storage) {
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop("HP", 60000.0, "i5", 16, 512);
		Laptop l2 = new Laptop("Lenovo", 80000.0, "i7", 8, 512);

		l1.displayLaptopDetails();
		l2.displayLaptopDetails();

	}

	public void displayLaptopDetails() {
		System.out.println("Laptop brand: " + this.brand);
		System.out.println("Laptop price: " + this.price);
		System.out.println("Laptop processor: " + this.processor);
		System.out.println("Laptop ram: " + this.ram);
		System.out.println("Laptop storage: " + this.storage);
		System.out.println();
	}

}
