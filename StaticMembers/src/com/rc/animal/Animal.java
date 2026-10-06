package com.rc.animal;

public class Animal {
	
	String name;
	
	public void gives() {
		Milk m = new Milk();
		m.litre=4;
		System.out.println("Animal "+this.name+" gives "+m.litre+" litres of milk");
	}

}
