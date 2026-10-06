package com.rc.compositionaggregation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Id id = new Id(123,"AB+","ISE");
		Student student = new Student("Ramesh",7789567898l,"ramesh123@gmail.com",id);
		student.displayStudentDetails();
//		System.out.println();
//		student.id.displayIdDetails();
		System.out.println();
		
		student.purchaseBook(new Book("Classmate",25.0,"Ruled"));
		
		student.write();
		System.out.println();
//		if(student.book!=null)
//			student.book.displayBookDetails();
//		else
//			System.out.println("Book is not Inserted");

	}

}
