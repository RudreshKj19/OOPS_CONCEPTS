package com.rc.composition;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Hyundai","Black",10000.0);
		car.displayCarDetails();
		System.out.println();
		car.engine.displayDetails();

	}

}
