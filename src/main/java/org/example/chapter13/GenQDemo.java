package org.example.chapter13;

public class GenQDemo {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        GenQueue<String> strQ = new GenQueue<String>(strArray);

        // Создать очередь для хранения целых чисел
        Integer[] intMassive = new Integer[10];
        GenQueue<Integer> intQueue = new GenQueue<Integer>(intMassive);

        Integer iVal;

        System.out.println("Демонстрация очереди чисел типа Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + i + " в очередь intQueue");
                intQueue.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди q: ");
                iVal = intQueue.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        // Создать очередь для хранения чисел с плавающей точкой
        Double[] doubleMassive = new Double[10];
        GenQueue<Double> doubleGenQueue = new GenQueue<>(doubleMassive);

        Double dVal;

        System.out.println("Демонстрация очереди чисел типа Double");
        try {
            for (int i = 0; i < 5; i ++ ) {
                System.out.println("Добавление " + (double) i/2 + " в очередь doubleGenQueue");
                doubleGenQueue.put((double) i / 2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Double из очереди doubleGenQueue: ");
                System.out.println(doubleGenQueue.get());
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
