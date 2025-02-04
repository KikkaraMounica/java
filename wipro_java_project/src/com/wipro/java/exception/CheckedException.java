package com.wipro.java.exception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
    	
    	try {
    		FileReader file = new
    				FileReader("non_existent_file.txt");
    		BufferedReader reader = new BufferedReader(file);
    		System.out.println(reader.readLine());
            reader.close();


    	} catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());

    	
    }
    
}
}
        