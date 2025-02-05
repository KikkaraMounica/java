package com.wipro.java.collection;

import java.util.Scanner;

/**
 * Demonstrates the use of ArrayList in Java collections. This program takes
 * user input to define an array, stores elements in it, and then prints the
 * elements.
 */
public class Array {

	public static void main(String[] args) {
		// Creating a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter the maximum range of the array
		System.out.println("Enter Max Range of an Array:");
		int n = sc.nextInt(); // Reading the array size

		// Declaring an integer array with the given size
		int a[] = new int[n];

		// Prompting the user to enter elements into the array
		System.out.println("Enter Elements to an Array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // Storing user-input values in the array
		}

		// Displaying the entered elements using an enhanced for loop
		System.out.println("Array Elements:");
		for (int num : a) {
			System.out.print(num + " ");
		}

		// Closing the Scanner object
		sc.close();
	}
}