package com.pluralsight;

import java.util.Scanner;

public class Vehicle {
   protected String color;
   protected int numberOfPassengers;
   protected int cargoCapacity;
   protected int fuelCapacity;

   Scanner input = new Scanner(System.in);

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity){
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }
    public Vehicle(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

   public void addVehicle(){
       System.out.println("Please enter new Vehicle information: ");
       System.out.print("What is the Vehicles Color:  ");
       this.color = input.nextLine();
       System.out.print("How many passengers can the Vehicle Carry:  ");
       this.numberOfPassengers = input.nextInt();
       System.out.print("What is the cargo capacity of the Vehicle:  ");
       this.cargoCapacity = input.nextInt();
       System.out.print("What is the Vehicles Fuel Capacity:  ");
       this.fuelCapacity = input.nextInt();
   }

}
