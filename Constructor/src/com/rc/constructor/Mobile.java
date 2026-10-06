package com.rc.constructor;

public class Mobile {

	String brand;
	double price;
	int ram;
	int storage;
	
	
	Mobile(String brand, double price, int ram, int storage) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("VIVO", 6999.0, 8, 256);
		Mobile m2 = new Mobile("OPPO", 7999.0, 16, 512);

		m1.displayMobileDetails();
		m2.displayMobileDetails();

	}

	public void displayMobileDetails() {
		System.out.println("Mobile brand: " + this.brand);
		System.out.println("Mobile price: " + this.price);
		System.out.println("Mobile ram: " + this.ram);
		System.out.println("Mobile storage: " + this.storage);
		System.out.println();
	}

}
