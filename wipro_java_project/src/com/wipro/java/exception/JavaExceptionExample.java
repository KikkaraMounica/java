/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class JavaExceptionExample {
		public static void main(String[] args) {
			int a=10,b=0;
			//Handling Arithmetic Exceptions
			try {
				int c=a/b;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(e.toString());
			}
			
		}

	}
