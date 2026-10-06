package com.rc.constructorchaining4multilevel;

public class Vehicle {
	int number;
	Vehicle(int number){
		this.number=number;
	}
	public void start() {
		System.out.println("Vehicle Started");
		System.out.println("Vehicle Num: "+this.number);
	}

}
