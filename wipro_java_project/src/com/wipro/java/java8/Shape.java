package com.wipro.java.java8;

//Functional Interface with methods containing logic
@FunctionalInterface
interface TestInterface {
	// Abstract method (mandatory in a functional interface)
	double area();

	// Default method 1: Display message
	default void display() {
		System.out.println("This is a shape.");
	}

	// Default method 2: Calculate and print square area
	default void printSquareArea(double side) {
		double area = side * side;
		System.out.println("Square Area: " + area);
	}

	// Static method 1: Calculate rectangle area
	static double calculateRectangleArea(double length, double width) {
		return length * width;
	}

	// Static method 2: Print a general message
	static void printMessage() {
		System.out.println("Shapes are important in geometry.");
	}
}

	//Main Class implementing TestInterface
public class Shape implements TestInterface {
	@Override
	public double area() {
		return 0; // No need for implementation since logic is in default/static methods
	}

	public static void main(String[] args) {
		Shape shape = new Shape(); // Creating an instance of the main class

		shape.display(); // Calling default method
		shape.printSquareArea(4); // Calling default method

		// Calling static methods directly from the interface
		double rectangleArea = TestInterface.calculateRectangleArea(5, 3);
		System.out.println("Rectangle Area: " + rectangleArea);

		TestInterface.printMessage(); // Calling static method
	}
}