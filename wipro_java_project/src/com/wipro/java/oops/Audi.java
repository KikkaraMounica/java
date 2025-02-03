package com.wipro.java.oops;

public class Audi extends Car {

	@Override
	public void CarDetails() {
		System.out.println("This is a Audi: " + getBrand() + " " + getModel() + " from year " + getYear());
	}

	public static void main(String[] args) {
		// Creating Audi object
		Car audi = new Audi();
		audi.setBrand("Audi");
		audi.setModel("RS5");
		audi.setYear(2021);
		audi.CarDetails();
	}

}