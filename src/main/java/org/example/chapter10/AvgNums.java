package org.example.chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("Сколько чисел вы введете: ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException exc) {
            System.out.println("Неверный формат");
            n = 0;
        }

        System.out.println("Ввод " + n + " значений");
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc) {
                System.out.println("Неверный формат");
                t = 0.0;
            }

            sum += t;

        }

        avg = sum / n;
        System.out.println("Среднее значение: " + avg);
    }
}
