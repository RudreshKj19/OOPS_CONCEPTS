package com.rc.staticvariable;

public class Mobile {
	String brand;
	double price;
	int ram;
	int rom;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();

		m1.brand = "OPPO";
		m1.price = 10000.0;
		m1.ram = 4;
		m1.rom = 256;

		m2.brand = "Vivo";
		m2.price = 12000.0;
		m2.ram = 8;
		m2.rom = 512;

		m1.displayMobileDetails();
		m2.displayMobileDetails();

	}

	public void displayMobileDetails() {

		System.out.println("Mobile brand : " + brand);
		System.out.println("Mobile price : " + price);
		System.out.println("Mobile ram : " + ram);
		System.out.println("Mobile storage : " + rom);
		System.out.println();

	}

}
