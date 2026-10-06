package com.rc.example4;

public class Shirt extends Dresses {
	
	@Override
	public void buyProduct() {
		System.out.println("Buying Shirt");
	}
	@Override
	public void trialWear() {
		System.out.println("Trying Shirt");
	}
}
