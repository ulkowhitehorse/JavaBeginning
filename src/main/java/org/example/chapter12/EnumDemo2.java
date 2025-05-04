package org.example.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        System.out.println("Константы Transport:");

        // применение метода values()
        Transport[] allTransports = Transport.values();
        for (Transport t: allTransports) {
            System.out.println(t);
        }

        System.out.println();

        // Применение метода ValueOf()
        Transport tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp содержит " + tp);
    }
}

