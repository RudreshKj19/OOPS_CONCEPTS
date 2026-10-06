package com.rc.constructorchaining6;

public class Saree extends Dress {
	double length;
	String type;
	
	Saree(int pid,double price,String material,String color,double length,String type){
		super(pid,price,material,color);
		this.length = length;
		this.type = type;
	}
	
	public void displaySareeDetails() {
		System.out.println("Product Id: "+this.pid);
		System.out.println("Price: "+this.price);
		System.out.println("Material: "+this.material);
		System.out.println("Color: "+this.color);
		System.out.println("Saree Length: "+this.length);
		System.out.println("Saree Type: "+this.type);
	}

}
