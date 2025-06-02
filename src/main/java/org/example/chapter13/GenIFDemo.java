package org.example.chapter13;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if (ob.contains(2))
            System.out.println("2 содержится в ob");
        else
            System.out.println("2 не содержится в ob");

        if (ob.contains(5))
            System.out.println("5 содержится в ob");
        else
            System.out.println("5 не содержится в ob");

    }
}

class MyClass<T> implements Containment<T> {
    T[] arrayRef; // Любой класс, реализующий обобщенный интерфейс также должен быть обобщенным
    MyClass(T[] o) {
        arrayRef = o;
    }

    // Реализовать метод contains()
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }

}
