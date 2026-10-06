package com.rc.aggregation2;

public class MainClass {
	
	public static void main(String[] args) {
		Student student = new Student("Ramesh",7798567834L,"ramesh@gmail.com");
		student.register();
		student.addAddress(new Address("Shivamogga",577204));
		System.out.println();
		
		if(student.address==null)
			System.out.println("Address is not Added");
		else
			student.address.cityDetails();
			
	}

}
