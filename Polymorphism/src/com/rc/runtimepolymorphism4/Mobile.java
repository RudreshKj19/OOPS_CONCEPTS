package com.rc.runtimepolymorphism4;

public class Mobile extends Electronics {
	
	int ram;
	int pixel;
	
	Mobile(int id,String brand,String type,int ram,int pixel){
		super(id,brand,type);
		this.ram=ram;
		this.pixel=pixel;
	}
	
	@Override
	public void switchOn() {
		System.out.println("Switch on the Mobile");
	}
	@Override
	public void switchOff() {
		System.out.println("Switch off the Mobile");
	}
	
	@Override
	public void displayProductDetails() {
		System.out.println("Mobile id: "+this.id);
		System.out.println("Mobile brand: "+this.brand);
		System.out.println("Mobile type: "+this.type);
		System.out.println("Mobile ram: "+this.ram);
		System.out.println("Mobile pixel: "+this.pixel);
	}

}
