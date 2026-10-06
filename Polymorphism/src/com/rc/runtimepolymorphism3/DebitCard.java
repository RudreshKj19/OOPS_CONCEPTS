package com.rc.runtimepolymorphism3;

public class DebitCard extends Card {
	
	@Override
	public void swipe() {
		System.out.println("For Money Transaction(DebitCard),...");
	}

}
