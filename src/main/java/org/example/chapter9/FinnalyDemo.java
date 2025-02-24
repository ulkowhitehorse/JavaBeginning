package org.example.chapter9;

public class FinnalyDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}

class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Получено: " + what);
        try{
            switch(what) {
                case 0:
                    t = 10 / what; // Сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // возвратиться из блока try
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("Попытка деления на нуль");
            return; // Вернуться из блока catch
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Соответствующий элемент не найден");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }
}
