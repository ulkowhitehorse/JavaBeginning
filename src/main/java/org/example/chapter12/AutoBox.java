package org.example.chapter12;

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; // Автоупаковка
        System.out.println(iOb.toString() + " - Упакованный объект");

        int i = iOb; // Автораспаковка
        System.out.println(i + " - распакованное значение");
        if (iOb.equals(100)) {
            System.out.println("iOb = " + iOb + " equals i = " + i);
        } else System.out.println("iOb = " + iOb + " not equals i = " + i);;
    }
}
