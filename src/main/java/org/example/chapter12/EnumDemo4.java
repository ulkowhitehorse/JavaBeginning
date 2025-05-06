package org.example.chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp, tp2, tp3;

        for (Transport t: Transport.values()) {
            System.out.println(t + " = " + t.ordinal() + ", ");
        }
        
        tp = Transport.AIRPLANE;
        tp2 = Transport.CAR;
        tp3 = Transport.AIRPLANE;

        if (tp.compareTo(tp3) == 0) {
            System.out.println("tp = tp3");
        }
    }
}
