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
    public void push(char ch) throws StackFullException {
        if (sPush < s.length) {
            s[sPush] = ch;
            sPop = sPush;
            sPush++;
        } else {
            throw new StackFullException(s.length-1);
        }
    }

    // Вытащить символ из стека
    public char pop() throws StackEmptyException {
        char popCh;
        if (sPop != 0) {
            popCh = s[sPop];
            s[sPop] = (char)0;
            sPop--;
            sPush--;
            return popCh;
        } else {
            throw new StackEmptyException();
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
        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Добавляю " + (char) ('a' + i) + " в очередь.");
                stack.push((char) ('a' + i));
            }
        }
        catch(StackFullException exc) {
            System.out.println(exc);
        }

        // Генерация ошибки
        try {
            stack.push((char) ('a' + size));
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        stack.printStack();

        // Удалить элементы из стека
        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Извлекаю элемент " + stack.pop());

            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }

        // Генерация ошибки
        try {
            stack.pop();
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("Кладу в стек z");
        try {
            stack.push('z');
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        stack.printStack();
        try {
            System.out.println("Извлекаю элемент " + stack.pop());
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        try {
            System.out.println("Извлекаю элемент " + stack.pop());
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        stack.printStack();
    }
}

class StackEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nСтек пуст. Заполните стек.";
    }
}

class StackFullException extends Exception {
    int size;

    StackFullException (int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nСтэк заполнен. Выполните очистку стека. Размер стека " + size;
    }
}
