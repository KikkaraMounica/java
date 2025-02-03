package com.wipro.java.oops.abstraction;

public class Honda extends Car {

	@Override
	public void mileage() {
		System.out.println("Honda has a mileage of 18.4 km/l");
	}

	@Override
	public void speed() {
		System.out.println("Honda has a top speed of 160 km/h");
	}

	public static void main(String[] args) {
		// Creating Honda object
		Car hondaCar = new Honda();
		hondaCar.mileage();
		hondaCar.speed();
	}

}
