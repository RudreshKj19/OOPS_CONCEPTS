package com.rc.multipleinheritance5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s = new SmartPhone("Iphone","Iphone 17pro",512);
		s.displaySmartPhoneDetails();
		System.out.println();
		s.switchOn();
		s.takePhoto();
		s.recordVideo();
		s.playMusic();
		s.stopMusic();
		

	}

}
