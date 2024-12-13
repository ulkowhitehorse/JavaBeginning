package org.example.chapter1;

public class GalToLit {
    double gallons; // Объем жидкости в галлонах
    double liters; // Объем жидкости в литрах
    final double gallon_in_liter = 3.7854;

    public void galToLit(double gallons) {
        this.gallons = gallons;
        liters = gallons * gallon_in_liter;

        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
    }
}
