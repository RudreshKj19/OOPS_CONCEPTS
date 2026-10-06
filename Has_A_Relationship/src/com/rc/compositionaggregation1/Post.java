package com.rc.compositionaggregation1;

public class Post {
	
	int noOfPhotos;
	double size;
	
	Post(int noOfPhotos,double size){
		this.noOfPhotos = noOfPhotos;
		this.size = size;
	}
	
	public void displayPostDetails() {
		System.out.println("No of Photos: "+this.noOfPhotos);
		System.out.println("Size: "+this.size);
	}

}
