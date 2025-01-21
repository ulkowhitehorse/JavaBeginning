package org.example.chapter6;

public class Queue {
    private char[] qChar; //массив для хранения элементов очереди
    private int[] qInt;
    private double[] qDouble;

    // индексы для вставки и извлечения элементов очереди
    int putlocChar, getlocChar, // для очереди qChar
            putlocInt, getlocInt, // для очереди qInt
            putlocDouble, getlocDouble; // для очереди qDouble

    Queue (int size) {
        qChar = new char[size+1]; // выделить память для очереди qChar
        qInt = new int[size+1]; // выделить память для очереди qInt
        qDouble = new double[size+1]; // выделить память для очереди qDouble
        putlocChar = getlocChar = 0;
        putlocInt = getlocInt = 0;
        putlocDouble = getlocDouble = 0;
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
