package org.example.chapter12;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Quadratic {
    public static void main(String[] args) {
        // a, b, c - коэффициенты квадратного уравнения
        // ax2 + bx + c = 0
        double a, b, c, x1, x2;

        // Решить квадратное уравнение 4x2 + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;

        // Найти первый корень
        x1 = (-b + sqrt(pow(b,2) - 4 * a * c)) / (2 * a);
        System.out.println("Первый корень: " + x1);

        // Найти второй корень
        x2 = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Второй корень: " + x2);

        if ((a * pow(x1, 2) + b * x1 + c) == 0) {
            System.out.println("Первый корень корректный.");
        } else System.out.println("Первый корень некорректный");
        if ((a * pow(x2, 2) + b * x2 + c) == 0) {
            System.out.println("Второй корень корректный");
        } else System.out.println("Второй корень некорректный");
    }
}
