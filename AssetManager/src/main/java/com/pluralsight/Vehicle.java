package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odomoter) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odomoter;

    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Vehicle\n" +
                "makeModel= " + makeModel + ' ' + ", year= " + year +
                ", odometer= " + odometer +
                ", description= " + description + '|' +
                ", dateAcquired= " + dateAcquired + '|' +
                ", originalCost= " + originalCost;
    }

    @Override//todo gets value from original price and age(percentage reduction)
    public double getValue() {
        return super.getValue();
    }
}

