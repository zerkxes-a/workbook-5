package com.pluralsight;

public class Hovercraft extends Vehicle{
     public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        Hovercraft jungleBoat = new Hovercraft();
    }

    public Hovercraft() {
        
    }
}
