package org.example;

public class Factorial {
    int fact;
    public int getFact(int number) {
        if(number == 1) return number;
        fact = getFact(number - 1) * number;
        return fact;
    }
}

class Demo {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Факториал 1 = "  + fact.getFact(1));
        System.out.println("Факториал 2 = "  + fact.getFact(2));
        System.out.println("Факториал 3 = "  + fact.getFact(3));
        System.out.println("Факториал 4 = "  + fact.getFact(4));
        System.out.println("Факториал 5 = "  + fact.getFact(5));
    }
}