package com.wipro.java.exception;

public class UncheckedException{
	
	public static void main(String[] args) {
		try {
			int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);

			
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Exception caught: " + e.getMessage());

		}
	}
}
   


        
