package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.DesignPatternUtil;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Printing a message from the Utility class
        DesignPatternUtil.printMessage("Starting Vehicle Factory...");

        // Get an object of Car and call its drive method.
        Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
        if (vehicle1 != null) {
            vehicle1.drive();
        } else {
            System.out.println("Invalid Vehicle Type: CAR");
        }

        // Get an object of Bike and call its drive method.
        Vehicle vehicle2 = vehicleFactory.getVehicle("BIKE");
        if (vehicle2 != null) {
            vehicle2.drive();
        } else {
            System.out.println("Invalid Vehicle Type: BIKE");
        }

        // Get an object of Truck and call its drive method.
        Vehicle vehicle3 = vehicleFactory.getVehicle("TRUCK");
        if (vehicle3 != null) {
            vehicle3.drive();
        } else {
            System.out.println("Invalid Vehicle Type: TRUCK");
        }
    }
}
