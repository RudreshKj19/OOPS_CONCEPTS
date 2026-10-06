package com.rc.multilevel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricCar e = new ElectricCar();
		e.start();
		e.playMusic();
		e.chargeBattery();
		
		System.out.println();
		
		Vehicle v = new Vehicle();
		v.start();
		
		System.out.println();
		
		Car c = new Car();
		c.start();
		c.playMusic();
		

	}

}
