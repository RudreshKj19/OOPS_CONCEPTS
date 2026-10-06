package com.rc.constructoroverloading3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobApplication j1 = new JobApplication("Darshan",3456789876l,"darshan@gmail.com",2026,3,"java,Html,Css","Backend Developer");
		JobApplication j2 = new JobApplication("Paramesh",9745673567l,"parmi@gmail.com",2027);
		JobApplication j3 = new JobApplication("Subhash",9567874536l,"subhash@gmail.com",2025,2);
		JobApplication j4 = new JobApplication("Suhail",7787546734l,"suhail@gmail.com",2024,"Python,Html,Css,js");
		JobApplication j5 = new JobApplication("Ranjith",7245689045l,"ranjith@gmail.com","Frontend Developer",2026);
		JobApplication j6 = new JobApplication("Girish",7754698726l,"girish@gmail.com",2022,5,"java,Html,Css,js,SpringBoot");
		JobApplication j7 = new JobApplication("Shashank",7765389726l,"shashank@gmail.com",2023,"java,Html,Css","Fullstack Developer");
		JobApplication j8 = new JobApplication("Chandhan",9267874537l,"chandhu@gmail.com",2025,"Backend Developer",2);
		
		j1.displayApplicationDetails();
		j2.displayApplicationDetails();
		j3.displayApplicationDetails();
		j4.displayApplicationDetails();
		j5.displayApplicationDetails();
		j6.displayApplicationDetails();
		j7.displayApplicationDetails();
		j8.displayApplicationDetails();
		
		

	}

}
