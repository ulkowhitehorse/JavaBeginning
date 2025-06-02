package org.example.chapter13;

public class QueueEmptyException extends Throwable {

    public String toString() {
        return "\nОчередь пуста";
    }
}
