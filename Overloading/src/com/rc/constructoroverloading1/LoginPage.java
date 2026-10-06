package com.rc.constructoroverloading1;

public class LoginPage {
	
	LoginPage(String username,String password){
		
		System.out.println("Login through username and password");
		System.out.println("username: "+username+" and password: "+password );
		System.out.println();

	}
	
	LoginPage(Long mobileNo,int otp){
		
		System.out.println("Login through MobileNumber and OTP");
		System.out.println("MoileNo: "+mobileNo+" and OTP: "+otp);
		System.out.println();
		
	}
	
	LoginPage(String gmail){
		
		System.out.println("Login through Gmail");
		System.out.println("Gmail: "+gmail);
		
	}
	
}
