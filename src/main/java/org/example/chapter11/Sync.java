package org.example.chapter11;

public class Sync {
    public static void main (String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread3 mt1 = new MyThread3("Child #1", a);
        MyThread3 mt2 = new MyThread3("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}

class SumArray {
    private int sum;

//    synchronized int sumArray (int nums[]) {
    int sumArray (int[] nums) {
        sum = 0; // Обнулить сумму

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);
        }

        try {
            Thread.sleep(10); // разрешить переключение задач
        }
        catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }

        return sum;
    }
}

class MyThread3 implements Runnable {
    Thread thrd;
    static SumArray sa  = new SumArray();
    int a[];
    int answer;

    // Создать новый поток
    MyThread3(String name, int nums[]) {

        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // запустить поток
    }

    // Начать выполнение нового потока
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " - запуск");
        synchronized (sa) { // Вызовы метода sumArray() для объекта sa синхронизированы
            answer = sa.sumArray(a);
        }
        System.out.println("СУММА для " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + "  завершение");
    }
}
