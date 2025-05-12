package com.pluralsight;

public class Car extends Vehicle{
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        Car car  = new Car();
        car.setCargoCapacity(250);
        car.setColor("Black");
        car.setNumberOfPassengers(4);
        car.setFuelCapacity(17);
    }

    public Car() {

    }
}
