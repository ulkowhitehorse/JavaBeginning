package org.example.chapter8;


import org.example.chapter8.qpack.CircularQueue;
import org.example.chapter8.qpack.DynQueue;
import org.example.chapter8.qpack.FixedQueue;
import org.example.chapter8.qpack.ICharQ;

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
