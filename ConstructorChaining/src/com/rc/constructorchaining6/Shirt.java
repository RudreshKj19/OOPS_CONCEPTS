package com.rc.constructorchaining6;

public class Shirt extends Dress {
	
	int size;
	String type;
	
	Shirt(int pid,double price,String material,String color,int size,String type){
		super(pid,price,material,color);
		this.size = size;
		this.type = type;
	}
	
	public void displayShirtdetails() {
		System.out.println("Product Id: "+this.pid);
		System.out.println("Price: "+this.price);
		System.out.println("Material: "+this.material);
		System.out.println("Color: "+this.color);
		System.out.println("Shirt Size: "+this.size);
		System.out.println("Shirt Type: "+this.type);
		System.out.println();
	}
	

}
