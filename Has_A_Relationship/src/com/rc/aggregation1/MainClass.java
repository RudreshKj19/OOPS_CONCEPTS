package com.rc.aggregation1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile("ViVo",8,256);
		mobile.displayMobileDetails();
		mobile.insertSim(new Sim("Jio",300));
		System.out.println();
		
		if(mobile.sim==null)
			System.out.println("Sim is not inserted");
		else
			mobile.sim.displaySimDetails();
			

	}

}
