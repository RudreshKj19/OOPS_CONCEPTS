package com.rc.singlelevel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.buyProduct();
		p.cancelProduct();
		System.out.println();
		
		Mobile m = new Mobile();
		m.buyProduct();
		m.cancelProduct();
		m.call();
		m.Message();

	}
	

}
