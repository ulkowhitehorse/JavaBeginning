package org.example.chapter9;

// Исключение, указывающее на переполнение очереди
public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) { size = s; }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
