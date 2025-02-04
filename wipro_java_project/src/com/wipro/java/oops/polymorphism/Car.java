package com.wipro.java.oops.polymorphism;

//Child class (Subclass) overriding the honk method
class Car extends Vehicle {
@Override
void honk() {
   System.out.println("Car honks: Honk Honk!");
}


//Main class to test method overloading and overriding

public static void main(String[] args) {
   // Demonstrating Method Overloading
   Vehicle vehicle = new Vehicle();
   vehicle.start();
   vehicle.start(60);
   vehicle.start(80, "Diesel");

   // Demonstrating Method Overriding
   vehicle.honk(); // Calls the parent class method
   vehicle = new Car();
   vehicle.honk();// Calls the overridden method in Car

}
}
  
