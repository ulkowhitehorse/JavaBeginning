package org.example.chapter13.stack;

public class GenStackDemo {
    public static void main(String[] args) {
        // Создать пустой стек на 10 элементов типа Integer
        Integer[] iStore = new Integer[10];
        GenStack<Integer> stk1 = new GenStack<>(iStore);

        // Создать стек из массива
        String[] name = {"ONe", "Two", "Three"};
        String[] strStore = new String[3];
        GenStack<String> stk2 = new GenStack<>(strStore, name);

        String str;
        int n;

        // Поместить ряд значений в stk1
        try {
            for (int i = 0; i < 10; i++) {
                stk1.push(i);
            }
        }
        catch(StackFullException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println("Содержимое stk1: ");
            for (int i = 0; i < 10; i++) {
                n = stk1.pop();
                System.out.println(n + " ");
            }
        }
        catch(StackEmptyException exc) {
            System.out.println();
        }
    }
}
