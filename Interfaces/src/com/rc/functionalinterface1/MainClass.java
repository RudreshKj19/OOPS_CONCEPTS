package com.rc.functionalinterface1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = ()->
			System.out.println("start the vehicle,..");
		v.start();

	}

}
