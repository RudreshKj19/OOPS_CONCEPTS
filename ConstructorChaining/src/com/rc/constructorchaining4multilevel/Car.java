package com.rc.constructorchaining4multilevel;

public class Car extends Vehicle {
	int cc;
	Car(int number,int cc){
		super(number);
		this.cc=cc;
	}
	public void drive() {
		System.out.println("Driving Started");
		System.out.println("Vehicle CC: "+this.cc);
	}

}
