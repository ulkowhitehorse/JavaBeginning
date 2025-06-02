package org.example.chapter13;

public interface Containment<T> {
    // Метод contains() проверяет, содержится ли некоторый элемент в объекте класса, реализующего
    // интерфейс Containment
    boolean contains(T o);
}
