package org.example.chapter13.stack;

public class StackFullException extends Exception {
    int size;

    StackFullException(int s) {size = s; }

    public String toString() {
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }


}
