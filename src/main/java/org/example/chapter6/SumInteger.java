package org.example.chapter6;

public class SumInteger {
    public static int sumElements(int ... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

class SumDemo {
    public static void main (String[] args) {
        System.out.println("Демонстрация метода с переменным количеством аргументов.");
        System.out.println("Передаем методу sumElements(1, 2, 3, 4, 5)");
        System.out.println("sum = " + SumInteger.sumElements(1, 2, 3, 4, 5));
    }
}
