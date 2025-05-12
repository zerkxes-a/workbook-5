package com.pluralsight;

public class Moped extends Vehicle{

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        Moped moped1 = new Moped();
        moped1.setColor("Mint Green");
        moped1.setCargoCapacity(10);
        moped1.setFuelCapacity(8);
        moped1.setNumberOfPassengers(1);
    }

    public Moped() {

    }
}
