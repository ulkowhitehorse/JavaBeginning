package org.example.javaRush;

public class Test {
    public static void main(String[] args) {
        System.out.println("getSquare: " + getSquare(7)); // 49.0
        System.out.println("getSquare: " + getSquare(100_000_001)); // 1.00000002E16
        System.out.println("getSquare: " + getSquare(9_000_000_000_000_000_001L)); // 8.1E37
        System.out.println("\n");

        int big = 1234567890;
        System.out.println("getDifference: " + getDifference(big)); // 46 или -46

        System.out.println("\n");
        System.out.println("isByte: " + isByte(12)); // true
        System.out.println("isShort:" + isShort(130999)); // false
        System.out.println("isInt:" + isInt(1999939990L)); // true
        System.out.println("isInt:" + isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        return l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE;
    }

    public static boolean isShort(long l) {
        return l <= Short.MAX_VALUE && l >= Short.MIN_VALUE;
    }

    public static boolean isInt(long l) {
        return l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE;
    }

    public static int getDifference(int big) {
        float approx = big;
        int a = big - (int)approx;
        return a;
    }

    public static double getSquare(long number) {
        double answer = number;
        answer *= number;
        return answer;
    }

}
