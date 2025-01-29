package org.example.chapter6;

public class Test {
    int a;

    Test(int i) { a = i;}

    static void swap(Test ob1, Test ob2) {
        int temp = ob1.a;
        ob1.a = ob2.a;
        ob2.a = temp;
    }
}

class TDemo {
    public static void main(String[] args) {
        Test ob1 = new Test(1);
        Test ob2 = new Test(2);

        System.out.println("ob1 a = " + ob1.a);
        System.out.println("ob2 a = " + ob2.a);

        System.out.println("Swap()");
        Test.swap(ob1, ob2);
        System.out.println("ob1 a = " + ob1.a);
        System.out.println("ob2 a = " + ob2.a);


    }
}