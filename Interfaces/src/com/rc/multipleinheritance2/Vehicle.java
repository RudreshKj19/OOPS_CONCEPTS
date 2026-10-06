package com.rc.multipleinheritance2;

public class Vehicle {
	
	String brand;
	int speed;
	
	Vehicle(String brand,int speed){
		this.brand=brand;
		this.speed=speed;
	}
	
	public void start() {
		System.out.println("Start the Vehicle");
	}
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle Brand Name: "+this.brand);
		System.out.println("Vehicle Speed: "+this.speed );
	}
}
