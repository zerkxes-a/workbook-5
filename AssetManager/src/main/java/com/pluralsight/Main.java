package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        House house = new House("main house", "07/30/1995", 200000, "105 Fieldbrook Drive, McMurray PA 15317", 3, 2000, 1);
        House house1 = new House("beach house", "08/01/2017", 450000, "Outer Banks", 3, 3500, 1);

        Vehicle vehicle = new Vehicle("Anna Car", "06/11/2022", 62000, "Acura RDX", 2022, 17530);
        Vehicle vehicle1 = new Vehicle("Convertible", "08/15/2025", 40000, "Mazda Miyata", 2025, 15);

        System.out.println(house);
    }
}
