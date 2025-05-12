package com.pluralsight;

public class Program {
    public static void main(String[] args) {

        Hovercraft jungleBoat = new Hovercraft("Red", 6, 6, 16);
        Moped vespa = new Moped("Mint Green", 5, 2, 9);
        Car acura = new Car("Black", 250, 5, 17);
        SemiTruck optimusPrime = new SemiTruck("Optimus", 50000, 2, 65);

        jungleBoat.setColor("beige");
        acura.setNumberOfPassengers(5);
        vespa.setFuelCapacity(7);
        optimusPrime.setCargoCapacity(0);
        System.out.println(optimusPrime.getCargoCapacity());

        Moped honda = new Moped();
        honda.addVehicle();
    }


}
