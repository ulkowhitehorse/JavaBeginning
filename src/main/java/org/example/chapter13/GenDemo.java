package org.example.chapter13;

public class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку на объект типа Gen<Integer>
        Gen<Integer> iOb;

        // Создать объект типа Gen<Integer> и присвоить ссылку на
        // него переменной iOb. (Автоупаковка при инкапсуляции значения 88 в объекте типа Integer
        iOb = new Gen<Integer>(88);

        // Отобразить тип данных, используемых в объекте iOb
        iOb.showType();

        // Получить значение из объекта iOb
        int v = iOb.getOb();
        System.out.println("значение: " + v);

        System.out.println();

        Gen<String> sOb = new Gen<String>("Тестирование обобщений");
        sOb.showType();
        String s = sOb.getOb();
        System.out.println("значение: " + s);
    }
}

// Обобщенный класс
class Gen<T> {
    T ob; // Объявить объект типа T

    // Передать конструктору ссылку на объект типа T
    Gen(T o){
        ob = o;
    }

    // Вернуть объект ob из метода
    T getOb() {
        return ob;
    }

    // Отобразить тип T
    void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
    }
}

