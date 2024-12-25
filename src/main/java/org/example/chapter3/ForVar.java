package org.example.chapter3;

public class ForVar {
    public void factorialAndSum() { //вычисляется сумма и факториал чисел до i
        int sum = 0;
        int fact = 1;
        int i = 1;

        for (; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        System.out.println("Сумма чисел до " + (i-1) + " равна: " + sum);
        System.out.println("Факториал чисел до " + (i-1) + " равен: " + fact);
    }
}
