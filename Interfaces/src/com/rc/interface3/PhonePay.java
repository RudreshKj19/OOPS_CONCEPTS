package com.rc.interface3;

public class PhonePay extends AbstractApplication {
	
	String bankName;
	String upiId;
	
	PhonePay(String userName,String email,String bankName,String upiId){
		super(userName,email);
		this.bankName=bankName;
		this.upiId=upiId;
	}
	
	@Override
	public void login() {
		System.out.println("Login successfull");
	}
	
	@Override
	public void displayApplicationDetails() {
		System.out.println("userName: "+this.userName);
		System.out.println("email: "+this.email);
		System.out.println("bankName: "+this.bankName);
		System.out.println("upiId: "+this.upiId);
	}
	
	@Override
	public void logout() {
		System.out.println("Logout successfull");
	}
	

}
