package org.example.chapter11;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread4 mt1 = new MyThread4("Tick", tt);
        MyThread4 mt2 = new MyThread4("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}

class TickTock {

    String state; // Содержит сведения о состоянии часов

    synchronized void tick(boolean running) {
        if (!running) { // остановить часы
            state = "ticked";
            notify(); // уведомить ожидающие потоки
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // установить текущее состояние
                        // после такта "тик"
        notify(); // позволить выполняться методу tock()

        try {
            while(!state.equals("tocked"))
                wait(); // Ожидать до завершения метода  tock()

        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // остановить часы
            state = "tocked";
            notify(); // уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        state = "tocked"; // установить текущее состояние после такста "так"

        notify(); // позволить выполняться методу tick()
        try {
            while(!state.equals("ticked"))
                wait(); // ожидать до завершения метода tick()
        }
        catch (InterruptedException exp) {
            System.out.println("Прерывание потока");
        }
    }
}

class MyThread4 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Создать новый поток
    MyThread4(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // запустить поток
    }

    // Начать выполнение потока
    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false );
        }
        else {
            for(int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}
