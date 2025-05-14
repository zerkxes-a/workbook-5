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

    @Override
    public double getValue() {
        double updatedCost = (originalCost) - (originalCost * 0.03);
        double updatedCost2 = (updatedCost) - (updatedCost * 0.03);
        double updatedCost3 = (updatedCost2) - (updatedCost2 * 0.03);
        double updatedCost4 = (updatedCost3) - (updatedCost3 * 0.06);
        double updatedCost5 = (updatedCost4) - (updatedCost4 * 0.06);
        double updatedCost6 = (updatedCost5) - (updatedCost5 * 0.06);
        double updatedCost7 = (updatedCost6) - (updatedCost6 * 0.08);
        double updatedCost8 = (updatedCost7) - (updatedCost7 * 0.08);
        double updatedCost9 = (updatedCost8) - (updatedCost8 * 0.08);
        double updatedCost10 = (updatedCost9) - (updatedCost9 * 0.08);
        if (year == 1) {
            return updatedCost;
        } else if (year == 2) {
            return updatedCost2;
        } else if (year == 3) {
            return updatedCost3;
        } else if (year == 4) {
            return updatedCost4;
        } else if (year == 5) {
            return updatedCost5;
        }else if (year == 6) {
            return updatedCost6;
        } else if (year == 7){
            return updatedCost7;
        }else if (year == 8){
            return updatedCost8;
        }else if (year == 9){
            return updatedCost9;
        }else if (year == 10){
            return updatedCost10;
        }else if (year > 10){
            return 1000.00;
        }

      //  return;
        return updatedCost;
    }
}

