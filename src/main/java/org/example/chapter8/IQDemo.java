package org.example.chapter8;


import org.example.chapter8.qpack.CircularQueue;
import org.example.chapter8.qpack.DynQueue;
import org.example.chapter8.qpack.FixedQueue;
import org.example.chapter8.qpack.ICharQ;
import org.example.chapter9.QueueEmptyException;
import org.example.chapter9.QueueFullException;

// Демонстрация трех реализаций интерфейса ICharQ
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue fixedQueue = new FixedQueue(10);
        DynQueue dynQueue = new DynQueue(5);
        CircularQueue circularQueue = new CircularQueue(10);

        // Тестирование модификатора protected
        Test test = new Test(2);
        System.out.println("test() = " + test.getTest());


        ICharQ iQ;


        char ch;
        int i;

        iQ = fixedQueue;

        // Поместить ряд символов в очередь фиксированного размера
        try {
            for (i = 0; i < 10; i++) {
                iQ.put((char) ('A' + i));
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }

        //Отобразить содержимое очереди
        System.out.print("Содержимое фиксированной очереди: ");
        try {
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        iQ = dynQueue;
        // Поместить ряд символов в динамическую очередь
        try {
            for (i = 0; i < 10; i++) {
                iQ.put((char) ('Z' - i));
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое динамической очереди: ");
        try {
            for (i = 0; i < 10; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        iQ = circularQueue;
        // Поместить ряд символов в кольцевую очередь
        try {
            for (i = 0; i < 10; i++) {
                iQ.put((char) ('A' + i));
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое кольцевой очереди: ");
        try {
            for (i = 10; i < 20; i++) {
                ch = iQ.get();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди");

        // Поместить символы в кольцевую очередь и извлечь их оттуда
        try {
            for (i = 0; i < 20; i++) {
                iQ.put((char) ('A' + i));
                ch = iQ.get();
                System.out.print(ch);
            }
        }
        catch (QueueFullException | QueueEmptyException exc) {
            System.out.println(exc);
        }

    }
}

class Test extends FixedQueue {

    public Test(int size) {
        super(size);
    }

    public char getTest() {
        return test();
    }
}
