package org.example.chapter4;

public class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        Queue intQ = new Queue(10);
        Queue doubleQ = new Queue(10);
        char ch;
        int qint;
        double qdouble;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        // Поместить буквенные символы в очередь bigQ
        for(i=0; i < 26; i++)
            bigQ.putqChar((char) ('A' + i));

        // Извлечь буквенные символы из очереди bigQ  и отобразить
        System.out.println("Содержимое очереди bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.getqChar();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        // Использовать очередь smallQ для генерации ошибок
        for(i=0; i < 5; i++){
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.putqChar((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.getqChar();
            if(ch != (char) 0) System.out.print(ch);
        }

        // Поместить int в очередь
        for(i=0; i < 10; i++) {
            intQ.putqInt(i);
        }
        System.out.println("Содержимое qInt: ");
        for(i=0; i < 10; i++) {
            qint = intQ.getqInt();
            if(qint != 0) System.out.print(qint);
            System.out.println();
        }

        // Поместить double в очередь
        for(double di = 0.0; di < 10; di++ ) {
            doubleQ.putqDouble(di);
        }
        System.out.println("Содержимое qDouble: ");
        for(double di = 0.0; di < 10; di++) {
            qdouble = doubleQ.getDouble();
            if(qdouble != 0) System.out.print(qdouble);
            System.out.println();
        }
    }
}

class Queue {
    char[] qChar; //массив для хранения элементов очереди
    int[] qInt;
    double[] qDouble;

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
