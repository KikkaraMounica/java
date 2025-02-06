package com.wipro.java.collection;

import java.util.*;
import java.util.Collections;

// POJO class implementing Comparable
class Movie implements Comparable<Movie> {
	private String name;// Movie Name Property
	private double rating;// rating Property
	private int year;// Year Property

	// Constructor
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	// Getters
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}