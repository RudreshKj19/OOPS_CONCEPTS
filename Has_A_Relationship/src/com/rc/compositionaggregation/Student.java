package com.rc.compositionaggregation;

public class Student {
	
	String name;
	long mobileNo;
	String email;
	Id id;
	Book book;
	
	Student(String name,long mobileNo,String email,Id id){
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.id = id;
	}
	public void displayStudentDetails() {
		System.out.println("Student Name: "+ this.name);
		System.out.println("Student MobileNo: "+this.mobileNo);
		System.out.println("Student email: "+this.email);
		System.out.println();
		System.out.println("Id No: "+id.no);
		System.out.println("Blood Group: "+id.bloodGroup);
		System.out.println("Branch: "+id.branch);
	}
	
	public void write() {
		if(this.book!=null)
			System.out.println("Student writing in "+book.brand+" book of type "+book.type+" and price is "+book.price);
		else
			System.out.println("Book is not Inserted");
	}
	
	public void purchaseBook(Book book) {
		this.book = book;
	}

}
