package org.example.chapter11;


public class MoreThreads {
    public static void main (String[] args) {
        System.out.println("Запуск основного потока");

        MyThread2 mt1 = new MyThread2("Child #1");
        MyThread2 mt2 = new MyThread2("Child #2");
        MyThread2 mt3 = new MyThread2("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        } while (mt1.thrd.isAlive() ||
                        mt2.thrd.isAlive() ||
                        mt3.thrd.isAlive() );

        System.out.println("Завершение основного потока");
    }
}

class MyThread2 implements Runnable {
    Thread thrd;

    MyThread2(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " - Запуск");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " прерван");
        }

        System.out.println(thrd.getName() + " - Завершение");
    }
}
