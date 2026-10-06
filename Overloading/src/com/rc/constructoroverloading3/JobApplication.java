package com.rc.constructoroverloading3;

public class JobApplication {
	
	String name;
	long mobileNo;
	String email;
	int yop;
	int experience;
	String skills;
	String role;
	
	JobApplication(String name,long mobileNo,String email,int yop,int experience,String skills,String role){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		this.experience=experience;
		this.skills=skills;
		this.role=role;
		
	}
	
	JobApplication(String name,long mobileNo,String email,int yop){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		
	}
	
	JobApplication(String name,long mobileNo,String email,int yop,int experience){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		this.experience=experience;
		
	}
	
	JobApplication(String name,long mobileNo,String email,int yop,String skills){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		this.skills=skills;
		
	}
	
	JobApplication(String name,long mobileNo,String email,String role,int yop){
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.role=role;
		this.yop=yop;
		
	}
	
	JobApplication(String name,long mobileNo,String email,int yop,int experience,String skills){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		this.experience=experience;
		this.skills=skills;
		
	}
	
	JobApplication(String name,long mobileNo,String email,int yop,String skills,String role){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		this.skills=skills;
		this.role=role;
		
	}
	
	JobApplication(String name,long mobileNo,String email,int yop,String role,int experience){
		
		this.name=name;
		this.mobileNo=mobileNo;
		this.email=email;
		this.yop=yop;
		this.role=role;
		this.experience=experience;
		
	}
	
	public void displayApplicationDetails() {
		System.out.println("Applicant Name: "+this.name);
		System.out.println("Applicant mobileNo: "+this.mobileNo);
		System.out.println("Applicant email: "+this.email);
		System.out.println("Applicant yop: "+this.yop);
		System.out.println("Applicant experience: "+this.experience+" yrs");
		System.out.println("Applicant skills: "+this.skills);
		System.out.println("Applicant role: "+this.role);
		System.out.println();
	}
	

}
