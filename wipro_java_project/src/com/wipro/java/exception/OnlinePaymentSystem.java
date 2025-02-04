package com.wipro.java.exception;

import java.util.Scanner;

public class OnlinePaymentSystem {
    private double balance = 5000.00; // User balance in the account

    // Method to Process Payment (Handling Checked Exception Internally)
    public void processPayment(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Payment failed! Insufficient funds. Current balance: " + balance);
            }
            balance -= amount;
            System.out.println("Payment successful! Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlinePaymentSystem paymentSystem = new OnlinePaymentSystem();
        try {
            System.out.print("Enter the payment amount: ");
            String input = scanner.next(); // User input (May cause InvalidAmountException)
            double amount = Double.parseDouble(input); // Converts input to double

            if (amount <= 0) {
                throw new NumberFormatException("Invalid amount! Please enter a positive number.");
            }

            paymentSystem.processPayment(amount); // Call the payment processing method
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our Online Payment System!");
        }

        scanner.close();

       
}
}
