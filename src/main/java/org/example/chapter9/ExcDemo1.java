package org.example.chapter9;

public class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("До генерации исключения");

            nums[7] = 10;
            //nums[0] = 10;
            System.out.println("Эта строка не будет отображаться");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");
    }
}
