package com.wipro.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store roll numbers and names
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Step 2: Add 10 students to the HashMap
        studentMap.put(101, "Mounica");
        studentMap.put(102, "Ram");
        studentMap.put(103, "Mounica"); // Duplicate name
        studentMap.put(104, "Geetha");
        studentMap.put(105, "Paul");
        studentMap.put(106, "Eva");
        studentMap.put(107, "Mounica"); // Duplicate name
        studentMap.put(108, "Mani");
        studentMap.put(109, "Petter");
        studentMap.put(110, "Munna");

        // Step 3: Display the HashMap
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
