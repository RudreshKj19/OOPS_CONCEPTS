package com.rc.runtimepolymorphism4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Electronics(123,"Vivo","mobile");
		accessObject(p);
		p= new Mobile(122,"Redmi","mobile",5,24);
		accessObject(p);		
	}
	
	public static void accessObject(Product p) {
		p.displayProductDetails();
		System.out.println();
		if(p instanceof Electronics) {
			Electronics e1 = (Electronics) p;
			e1.switchOn();
			e1.switchOff();
			System.out.println();
		   }
		else if(p instanceof Mobile) {
			Mobile m = (Mobile) p;
			m.switchOn();
			m.switchOff();
		}
	}
}
