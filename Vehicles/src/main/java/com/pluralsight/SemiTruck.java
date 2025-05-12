package com.pluralsight;

public class SemiTruck extends Vehicle{

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        SemiTruck semiTruck1 = new SemiTruck();
        semiTruck1.setColor("Red");
        semiTruck1.setFuelCapacity(45);
        semiTruck1.setNumberOfPassengers(2);
        semiTruck1.setCargoCapacity(1000);
    }

    public SemiTruck() {

    }
}
