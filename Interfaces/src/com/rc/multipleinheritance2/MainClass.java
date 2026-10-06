package com.rc.multipleinheritance2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricCar ec = new ElectricCar("Mahindra",190,"BE6",75);
		ec.displayVehicleDetails();
		System.out.println();
		ec.charge();
		ec.start();
		ec.stop();
		

	}

}
