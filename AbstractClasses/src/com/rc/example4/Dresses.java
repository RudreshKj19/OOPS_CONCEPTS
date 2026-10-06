package com.rc.example4;

public abstract class Dresses extends Product {
	
	@Override
	public void buyProduct() {
		System.out.println("Buying Dress");
    }
	
	abstract public void trialWear();
}
