package com.rc.constructor;

public class Movie {

	String title;
	String hero;
	String director;
	double rating;
	int duration;

	Movie(String title, String hero, String director, double rating, int duration) {

		this.title = title;
		this.hero = hero;
		this.director = director;
		this.rating = rating;
		this.duration = duration;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie("Jackie", "Puneeth RajKumar", "Soori", 4.9, 155);
		Movie m2 = new Movie("Premaloka", "V Ravichandran", "V Ravichandran", 5, 147);

		m1.displayMovieDetails();
		m2.displayMovieDetails();

	}

	public void displayMovieDetails() {
		System.out.println("Movie title: " + this.title);
		System.out.println("Movie hero: " + this.hero);
		System.out.println("Movie director: " + this.director);
		System.out.println("Movie rating: " + this.rating);
		System.out.println("Movie duration: " + this.duration + " minutes");
		System.out.println();
	}

}
