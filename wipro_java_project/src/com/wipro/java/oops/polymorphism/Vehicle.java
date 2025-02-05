package com.wipro.java.oops.polymorphism;

//Parent class (Superclass)
class Vehicle {
// Method Overloading: Multiple methods with the same name but different parameters

// Method 1: Start vehicle without parameters
	void start() {
		System.out.println("Starting the vehicle...");
	}

// Method 2: Start vehicle with speed (Overloaded method)
	void start(int speed) {
		System.out.println("Starting the vehicle at speed: " + speed + " km/h");
	}

// Method 3: Start vehicle with speed and fuel type (Overloaded method)
	void start(int speed, String fuelType) {
		System.out.println("Starting the vehicle at speed: " + speed + " km/h using " + fuelType);
	}

// Method Overriding: This method will be overridden by the child class
	void honk() {
		System.out.println("Vehicle honks: Beep Beep!");
	}
}
