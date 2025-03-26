package org.example.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread1 mt = new MyThread1("Child #1");

        for(int i = 0; i < 50; i++) {
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

class MyThread1 extends Thread {
    MyThread1 (String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("B " + getName() + ", счетчик: " + i);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(getName() + " прерван");
        }

        System.out.println(getName() + " - завершение");
    }
}
