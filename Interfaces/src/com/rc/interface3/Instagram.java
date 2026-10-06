package com.rc.interface3;

public class Instagram extends AbstractApplication {
	
	int noOfFollower;
	int noOfFollowing;
	
	Instagram(String userName,String email,int noOfFollower,int noOfFollowing ){
		super(userName,email);
		this.noOfFollower=noOfFollower;
		this.noOfFollowing=noOfFollowing;	
	}
	
	@Override
	public void login() {
		System.out.println("Login successfull");
	}
	
	@Override
	public void displayApplicationDetails() {
		System.out.println("userName: "+this.userName);
		System.out.println("email: "+this.email);
		System.out.println("num of followers: "+this.noOfFollower);
		System.out.println("num of following: "+this.noOfFollowing);
	}
	
	@Override
	public void logout() {
		System.out.println("Logout successfull");
	}

}
