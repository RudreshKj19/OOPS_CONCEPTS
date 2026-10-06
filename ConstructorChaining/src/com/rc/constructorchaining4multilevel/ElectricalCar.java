package com.rc.constructorchaining4multilevel;

public class ElectricalCar extends Car {
	String batteryType;
	
	ElectricalCar(int number,int cc,String batteryType){
		super(number,cc);
		this.batteryType=batteryType;
	}
	
	public void chargeBattery() {
		System.out.println("Fully Charged");
		System.out.println("Vehicle BatteryType: "+this.batteryType);
	}
	

}
