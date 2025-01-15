package org.example.chapter4;

public class ShiftDemo {

    private int val;

    public void shiftLeft(int val1) {
        this.val = val1;
        for(int i=0; i < 8; i++) {
            for(int t=128; t > 0; t = t/2) {
                if((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val << 1; // Сдвинуть влево
        }
        System.out.println();
    }

    public void shiftRight(int val2) {
        this.val = val2;
        for(int i=0; i < 8; i++) {
            for(int t=128; t>0; t = t/2) {
                if((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1; // Сдвинуть вправо
        }
    }

    public static void main(String[] args) {
        ShiftDemo shiftDemo = new ShiftDemo();
        int val1 = 1;
        int val2 = 128;

        System.out.println("число 1: " + val1);
        System.out.println("Сдвигаем влево << ");
        shiftDemo.shiftLeft(val1);

        System.out.println("число 2: " + val2);
        System.out.println("Сдвигаем вправо >> ");
        shiftDemo.shiftRight(val2);
    }
}

