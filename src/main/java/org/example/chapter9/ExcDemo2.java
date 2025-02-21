package org.example.chapter9;

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");
    }
}

class ExcTest {
    // Генерация исключения
    static void genException() {
        int[] nums = new int[4];

        System.out.println("До генерации исключения");

        // Сгенерировать исключения в связи с выходом индекса за границы массива
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}


