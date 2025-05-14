package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("main house", "07/30/1995", 200000, "105 Fieldbrook Drive, McMurray PA 15317", 3, 2000, 1));
        assets.add(new House("beach house", "08/01/2017", 450000, "Outer Banks", 3, 3500, 1));

        assets.add(new Vehicle("Anna Car", "06/11/2022", 62000, "Acura RDX", 4, 17530));
        assets.add(new Vehicle("Convertible", "08/15/2025", 40000, "Mazda Miyata", 11, 15));

        for (Asset asset : assets){
         asset.description.
        }
    }
}
