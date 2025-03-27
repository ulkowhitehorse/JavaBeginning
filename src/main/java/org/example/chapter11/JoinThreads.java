package org.example.chapter11;

public class JoinThreads {
    public static void main (String[] args) {
        System.out.println("Запуск основного потока");

        MyTread mt1 = new MyTread("Child #1");
        MyTread mt2 = new MyTread("Child #2");
        MyTread mt3 = new MyTread("Child #3");

        try {
            mt1.thrd.join();
            System.out.println(mt1.thrd.getName() + " присоединен");
            mt2.thrd.join();
            System.out.println(mt2.thrd.getName() + " присоединен");
            mt3.thrd.join();
            System.out.println(mt3.thrd.getName() + " присоединен");

        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Завершение основного потока");
    }
}

class MyTread implements Runnable {
    Thread thrd;

    MyTread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }


    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for(int count = 0; count < 10; count++ ) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}
