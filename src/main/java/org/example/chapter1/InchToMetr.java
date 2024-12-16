package org.example.chapter1;

public class InchToMetr {
    double inch_in_metr = 39.37;

    public void inchToMetr() {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " дюйм равен " + i / inch_in_metr  + " метрам");
        }
        System.out.println();
    }
}
