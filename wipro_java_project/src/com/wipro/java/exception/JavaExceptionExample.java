/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class JavaExceptionExample {
		public static void main(String[] args) {
			int num1=10,num2=0;
			//Handling Arithmetic Exceptions
			try {
				int c=num1/num2;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(e.toString());
			}
			
		}

	}
