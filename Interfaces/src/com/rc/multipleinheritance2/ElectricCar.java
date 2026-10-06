package com.rc.multipleinheritance2;

public class ElectricCar extends Vehicle implements Electric {
	
	String model;
	int batteryCapacity;
	
	ElectricCar(String brand,int speed,String model,int batteryCapacity){
		super(brand,speed);
		this.model=model;
		this.batteryCapacity=batteryCapacity;
	}
	
	@Override
	public void start() {
		System.out.println("Start the Electric Car");
	}
	
	@Override
	public void charge() {
		System.out.println("Charge the Electric Car");
	}
	
	public void stop() {
		System.out.println("Stop the Electric Car");
	}
	
	@Override
	public void displayVehicleDetails() {
		System.out.println("Electric Car Brand Name: "+this.brand);
		System.out.println("Electric Car Speed: "+this.speed );
		System.out.println("Electric Car Model: "+this.model);
		System.out.println("Electric Car batteryCapacity: "+this.batteryCapacity);
	}

}
