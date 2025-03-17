package org.example.chapter10;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("Введите целочисленное значение");

        if (scan.hasNextInt()) {
            num = scan.nextInt();
            System.out.println("Вы ввели: " + num);
        } else {
            System.out.println("Вы ввели не целочисленное значение");
        }


    }
}
