package org.example.chapter12;
import static java.lang.Math.sqrt;

public class Exercise3 {
    public static void main(String[] args) {
        Short val = 123;
        double answer;
        answer = sqrt(val);
        System.out.println("answer = " + answer);
        for (Tools t: Tools.values()) {
            System.out.println(t);
        }
    }
}

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
