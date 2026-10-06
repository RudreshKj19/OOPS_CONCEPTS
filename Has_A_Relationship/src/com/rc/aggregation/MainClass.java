package com.rc.aggregation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag bag = new Bag("Sky Bag","Black",2500);
		bag.displayBagDetails();
		bag.insertBook(new Book("Java",250));
		System.out.println();
		
		
		if(bag.book==null)
			System.out.println("Book is not Inserted");
		else
			bag.book.displayBookDetails();
			

	}

}
