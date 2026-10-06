package com.rc.compositionaggregation1;

public class Instagram {
	
	String userName;
	int noOfFollowers;
	int noOfFollowing;
	Login login;
	Post post;
	
	Instagram(String userName,int noOfFollowers,int noOfFollowing,Login login){
		this.userName = userName;
		this.noOfFollowers = noOfFollowers;
		this.noOfFollowing = noOfFollowing;
		this.login = login;
	}
	
	public void displayProfileDetails() {
		System.out.println("UserName: "+this.userName);
		System.out.println("No of Followers: "+this.noOfFollowers);
		System.out.println("No of Following: "+this.noOfFollowing);
		System.out.println();
		System.out.println("Email Id: "+login.email);
		System.out.println("PassWord: "+login.passWord);
	}
	
	public void uploadPost(Post post) {
		this.post = post;
	}

}
