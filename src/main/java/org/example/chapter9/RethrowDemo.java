package org.example.chapter9;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // Повторно перехватить исключение
            System.out.println("Фотальная ошибка - " +
                    "выполнение программы прервано!");
        }
    }
}

class Rethrow {
    public static void genException() {
        int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] denom = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " равно "
                        + numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Попытка деления на ноль");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден");
                throw exc;
            }
        }
    }
}
