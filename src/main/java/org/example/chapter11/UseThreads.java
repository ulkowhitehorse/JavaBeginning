package org.example.chapter11;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        // Сначала создать объект типа MyThread
        MyThread mt = new MyThread("Child #1");

        // Затем сформировать поток на основе этого объекта.
        Thread newThrd = new Thread(mt);

        // Начать выполнение этого потока
        newThrd.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}

class MyThread implements Runnable {
    Thread thrd;

    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    // Точка входа в поток
    public void run() {
        System.out.println(thrd.getName() + " - Запуск");
        try {
            for (int count = 0; count < 10; count ++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}
