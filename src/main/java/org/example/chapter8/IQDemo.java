package org.example.chapter8;


// Демонстрация трех реализаций интерфейса ICharQ
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue fixedQueue = new FixedQueue(10);
        DynQueue dynQueue = new DynQueue(5);
        CircularQueue circularQueue = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = fixedQueue;

        // Поместить ряд символов в очередь фиксированного размера
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }

        //Отобразить содержимое очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = dynQueue;
        // Поместить ряд символов в динамическую очередь
        for(i=0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое динамической очереди: ");
        for(i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = circularQueue;
        // Поместить ряд символов в кольцевую очередь
        for(i=0; i < 10; i++){
            iQ.put((char) ('A' + i));
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for(i=10; i < 20; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди");

        // Поместить символы в кольцевую очередь и извлечь их оттуда
        for(i=0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

    }
}

class FixedQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size+1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(char ch) {
        if(putloc==q.length-1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    public char get() {
        if(getloc==putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}

class CircularQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // 4индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public CircularQueue(int size) {
        q = new char[size+1]; // Выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    @Override
    public void put(char ch) {
        /* Очередь считается полной, если индекс putloc на единицу меньше индекса getloc или если индекс
        putloc указывает на конец массива, а индекс getloc - на его начало
         */
        if(putloc+1==getloc | ((putloc==q.length-1) & (getloc==0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        if(putloc==q.length) putloc = 0; // перейти в начало массива
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    @Override
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        if(getloc==q.length) getloc = 0; // вернуться в начало очереди
        return q[getloc];
    }



}

// Динамическая очередь
class DynQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индесксы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size+1]; // Выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    @Override
    public void put(char ch) {
        if(putloc==q.length-1) {
            // увеличить размер очереди
            char[] t = new char[q.length * 2];

            // Скопировать элементы в новую очередь
            for(int i=0; i < q.length; i++) {
                t[i] = q[i];

            }
            q = t;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    @Override
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
