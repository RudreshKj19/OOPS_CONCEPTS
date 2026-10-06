package com.rc.constructorchaining6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Choice: ");
		
		
		int choice = sc.nextInt();
		
		if(choice==1) {
		
		System.out.print("Enter Product Id: ");
		int pid = sc.nextInt();
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		System.out.print("Material: ");
		String material = sc.next();
		System.out.print("Color: ");
		String color = sc.next();
		System.out.print("Size: ");
		int size = sc.nextInt();
		System.out.print("Type: ");
		String type = sc.next();
		System.out.println();
	
		
		Shirt s = new Shirt(pid,price,material,color,size,type);
		s.displayShirtdetails();
		
		
		}
		else if(choice ==2) {
			
			System.out.print("Enter Product Id: ");
			int pid = sc.nextInt();
			System.out.print("Enter Price: ");
			double price = sc.nextDouble();
			System.out.print("Material: ");
			String material = sc.next();
			System.out.print("Color: ");
			String color = sc.next();
			System.out.print("Type: ");
			String type = sc.next();
			System.out.print("Saree Length: ");
			double length = sc.nextInt();
			System.out.println();
			
			Saree s1 = new Saree(pid,price,material,color,length,type);
			
			
			s1.displaySareeDetails();
			
		}
	}

}
