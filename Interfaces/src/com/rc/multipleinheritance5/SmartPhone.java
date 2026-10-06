package com.rc.multipleinheritance5;

public class SmartPhone implements Camera,MusicPlayer {
	
	String brand;
	String model;
	int storage;
	
	SmartPhone(String brand,String model,int storage){
		this.brand=brand;
		this.model=model;
		this.storage=storage;
	}
	
	@Override
	public void switchOn(){
		System.out.println("Switch On the SmartPhone");
	}
	
	@Override
	public void takePhoto() {
		System.out.println("Click a Photo using SmartPhone");
	}
	
	@Override
	public void recordVideo() {
		System.out.println("Record a Video using SmartPhone");
	}
	
	@Override
	public void playMusic() {
		System.out.println("playing music:u r my hangoverrrr Mounaraagangal");
	}
	
	@Override
	public void stopMusic() {
		System.out.println("Stop the Music");
	}
	
	public void displaySmartPhoneDetails() {
		System.out.println("Brand: "+this.brand);
		System.out.println("Model: "+this.model);
		System.out.println("Storage: "+this.storage);
	}

}
