package org.example.chapter9;

// Исключение, указывающее на исчерпание очереди
public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nОчередь пуста";
    }
}
