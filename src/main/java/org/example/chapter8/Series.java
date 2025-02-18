package org.example.chapter8;

public interface Series {
    int getNext(); // вернуть следующее число в ряду

    // Возвратить массив, который содержит n элементов, располагающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for(int i=0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset(); //сброс
    void setStart(int x); // установка начального значения
}

class Vals implements Series {
    int[] series;
    int start;

    public Vals(int size) {
        series = new int[size];
        for (int i = 0; i < series.length; i++) {
            series[i] = i;
        }
        start = 0;
    }

    public Vals(int size, int start) {
        series = new int[size];
        for (int i = 0; i < series.length; i++) {
            series[i] = i;
        }
        if (start < series.length) this.start = start;
        else {
            System.out.println(start + " значение больше величины массива, start установлен по умолчанию - 0");
            this.start = 0;
        }
    }

    @Override
    public int getNext() {
        start++;
        if (start > series.length) {
            System.out.println("Ошибка чтения следующего элемента, вышли за пределы массива. Введите reset");
            return 0;
        } else {
            System.out.println("Следующий элемент равен: " + series[start-1] + "\n");
            return series[start - 1];
        }
    }

    @Override
    public void reset() {
        System.out.println("сброс start в 0");
        start = 0;
    }

    @Override
    public void setStart(int x) {
        if (start < series.length) {
            System.out.println("start установлен в " + x);
            start = x;
        } else {
            System.out.println(x + " значение больше количества элементов массива, start установлен по умолчанию - 0");
            start = 0;
        }
    }
}

class QDemoSeries {
    public static void main(String[] args) {
        Vals vals = new Vals(10);

        for (int i = 0; i < 20; i++) {
            vals.getNext();
        }
        vals.reset();
        for (int i = 0; i < 5; i++) {
            vals.getNext();
        }
        vals.setStart(7);
        vals.getNext();
        int[] vals2 = vals.getNextArray(5);
        for (int i = 0; i < 5; i++ ) {
            System.out.println("vals2[" + i + "] = " + vals2[i] );
        }

    }
}