package org.example.chapter11;

public class Suspend {
    public static void main(String[] args) {
        MyThread5 ob1 = new MyThread5("My thread");

        try {
            Thread.sleep(1000); // позволить потоку ob1 начать выполнение

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mystop();
            System.out.println("Остановка потока");
            ob1.mystop();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }

        // Ожидать завершения потока
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }

        System.out.println("Выход из основного потока");
    }
  }

class MyThread5 implements Runnable {
    Thread thrd;

    volatile boolean suspended; // Приостанавливает поток при значении true
    volatile boolean stopped; // Останавливает поток при значении true

    MyThread5(String name ) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    // Точка входа в поток
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int i = 0; i < 1000; i++){
                System.out.print(i + " ");
                if ((i%10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - выход");
    }

    synchronized void mystop() {
        stopped = true;

        // Следующие операторы обеспечивают полную остановку приостановленного потока
        suspended = false;
        notify();
    }

    // Приостановить поток
    synchronized void mysuspend() {
        suspended = true;
    }

    // Возобновить поток
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
