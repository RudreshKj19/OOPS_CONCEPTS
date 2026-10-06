package com.rc.constructorchaining6;

public class Dress extends Product {
	
	String material;
	String color;
	
	Dress(int pid,double price,String material,String color){
		super(pid,price);
		this.material = material;
		this.color = color;
		
	}

}
