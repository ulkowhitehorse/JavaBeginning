package org.example.chapter6;

public class Stack {
    private char[] s;
    private int sPop = 0;
    private int sPush = 1;

    public Stack (int size) {
        s = new char[size+1];
        s[0] = 0;
    }

    // Положить символ в стек
    public void push(char ch) {
        if (sPush < s.length) {
            s[sPush] = ch;
            sPop = sPush;
            sPush++;
        } else {
            System.out.println("Стек заполнен");
        }
    }

    // Вытащить символ из стека
    public char pop() {
        char popCh;
        if (sPop != 0) {
            popCh = s[sPop];
            s[sPop] = (char)0;
            sPop--;
            sPush--;
            return popCh;
        } else {
            System.out.println("Стек пуст");
            return (char)0;
        }
    }

    // Прочитать элементы стека
    public void printStack() {
        System.out.print("В стеке лежат:");
        for (int i = 0; i < s.length; i++) {
            System.out.print(" " + s[i]);
        }
        System.out.println();
    }
}

class SDemo {
    public static void main (String[] args) {
        int size = 5;

        Stack stack = new Stack(size);

        stack.printStack();

        // Добавить элементы в стек
        for(int i=0; i < size; i++) {
            System.out.println("Добавляю " + (char)('a' + i) + " в очередь.");
            stack.push((char)('a' + i));
        }

        // Генерация ошибки
        stack.push((char)('a' + size));

        stack.printStack();

        // Удалить элементы из стека
        for(int i=0; i < size; i++) {
            System.out.println("Извлекаю элемент " + stack.pop());

        }

        // Генерация ошибки
        stack.pop();

        System.out.println("Кладу в стек z");
        stack.push('z');
        stack.printStack();
        System.out.println("Извлекаю элемент " + stack.pop());

        System.out.println("Извлекаю элемент " + stack.pop());
        stack.printStack();
    }
}
