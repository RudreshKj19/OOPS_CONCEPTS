package com.rc.interface3;

public abstract class AbstractApplication implements Application{
	
	String userName;
	String email;
	
	AbstractApplication(String userName,String email){
		this.userName=userName;
		this.email=email;
	}
	public void displayApplicationDetails() {
		System.out.println("userName: "+this.userName);
		System.out.println("email: "+this.email);
	}
}
