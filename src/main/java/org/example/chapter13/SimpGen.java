package org.example.chapter13;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        String str = tgObj.getOb2();
        System.out.println(v + ", " + str);
    }
}

class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("Тип Т - это " + ob1.getClass().getName());

        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

