package com.rc.constructorchaining4multilevel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricalCar ec = new ElectricalCar(1234,800,"lithium");
		
		ec.start();
		System.out.println();
		ec.drive();
		System.out.println();
		ec.chargeBattery();

	}

}
