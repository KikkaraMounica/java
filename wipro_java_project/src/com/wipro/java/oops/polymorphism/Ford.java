package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inhertiance.Car;

public class Ford extends Car {

	@Override
	public void CarDetails() {
		System.out.println("This is a Ford: " + getBrand() + " " + getModel() + " from year " + getYear());
	}

	public static void main(String[] args) {
		// Creating Ford object
		Car fordcar = new Ford();
		fordcar.setBrand("Ford");
		fordcar.setModel("EcoSport");
		fordcar.setYear(2022);
		fordcar.CarDetails();
	}

}