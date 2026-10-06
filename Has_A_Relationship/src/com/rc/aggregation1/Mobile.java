package com.rc.aggregation1;

public class Mobile {
	
	String brand;
	int ram;
	int rom;
	
	Sim sim;
	
	Mobile(String brand,int ram,int rom){
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
	}
	
	public void displayMobileDetails() {
		System.out.println("Mobile Brand: "+this.brand);
		System.out.println("Mobile ram: "+this.ram);
		System.out.println("Mobile rom: "+this.rom);
	}
	
	public void insertSim(Sim sim) {
		this.sim = sim;
	}

}
