package org.example.chapter6;

public class QDemo2 {
    public static void main(String[] args) {
        // Создать пустую очередь для хранения 10 элементов
        Queue2 q1 = new Queue2(10);


        char name[] = {'T', 'o', 'm'};
        // Создать очередь на основе массива
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        // Поместить ряд символов в очередь q1
        for(i=0; i < 10; i++)
            q1.putqChar((char) ('A' + i));

        // Создать одну очередь на основе другой
        Queue2 q3 = new Queue2(q1);

        // Показать очереди
        System.out.print("Содержимое q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.getqChar();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for(i=0; i < 3; i++) {
            ch = q2.getqChar();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.getqChar();
            System.out.print(ch);
        }
        System.out.println();
    }
}

class Queue2 {
    private char[] qChar; //массив для хранения элементов очереди
    private int[] qInt;
    private double[] qDouble;
    private int size;

    // индексы для вставки и извлечения элементов очереди
    int putlocChar, getlocChar, // для очереди qChar
            putlocInt, getlocInt, // для очереди qInt
            putlocDouble, getlocDouble; // для очереди qDouble

    Queue2 (Queue2 ob) {
        putlocChar = ob.putlocChar;

        getlocChar = ob.getlocChar;

        qChar = new char[ob.qChar.length];
        for(int i=getlocChar+1; i <= putlocChar; i++) {
            qChar[i] = ob.qChar[i];
        }

    }

    Queue2 (char a[]) {
        putlocChar = 0;
        getlocChar = 0;
        qChar = new char[a.length+1];

        for (int i = 0; i < a.length; i++) putqChar(a[i]);
    }

    Queue2 (int size) {
        this.size = size;
        qChar = new char[size+1]; // выделить память для очереди qChar
        qInt = new int[size+1]; // выделить память для очереди qInt
        qDouble = new double[size+1]; // выделить память для очереди qDouble
        putlocChar = getlocChar = 0;
        putlocInt = getlocInt = 0;
        putlocDouble = getlocDouble = 0;
    }

    public int getSize() {
        return size;
    }

    // Поместить символ в очередь qChar
    void putqChar(char ch) {
        if(putlocChar == qChar.length - 1) {
            System.out.println(" - Очередь qChar заполнена");
            return;
        }

        putlocChar++;
        qChar[putlocChar] = ch;
    }

    // Поместить число int в очередь qInt
    void putqInt(int i) {
        if(putlocInt == qInt.length - 1) {
            System.out.println(" - Очередь qInt заполнена");
            return;
        }

        putlocInt++;
        qInt[putlocInt] = i;
    }

    // Поместить число double в очередь qDouble
    void putqDouble(double d) {
        if (putlocDouble == (qDouble.length - 1)) {
            System.out.println(" - Очередь qDouble заполнена");
            return;
        }

        putlocDouble++;
        qDouble[putlocDouble] = d;
    }



    // Извлечь символ из очереди
    char getqChar() {
        if (getlocChar == putlocChar) {
            System.out.println(" - Очередь qChar пуста");
            return (char) 0;
        }

        getlocChar++;
        return qChar[getlocChar];
    }

    // Извлечь число int из очереди qInt
    int getqInt() {
        if (getlocInt == putlocInt) {
            System.out.println(" - Очередь qInt пуста");
            return 0;
        }

        getlocInt++;
        return qInt[getlocInt];
    }

    // Извлечь число double из очереди qDouble
    double getDouble() {
        if (getlocDouble == putlocDouble) {
            System.out.println(" - Очередь qDouble пуста");
            return 0;
        }

        getlocDouble++;
        return qDouble[getlocDouble];
    }
}
