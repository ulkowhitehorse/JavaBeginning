package org.example.chapter13;

import org.example.chapter9.QueueEmptyException;
import org.example.chapter9.QueueFullException;

// Обобщенный интерфейс очереди
public interface IGenQ<T> {
    // Поместить элемент в очередь
    void put(T ch) throws QueueFullException, org.example.chapter13.QueueFullException;

    // Извлечь элемент из очереди
    T get() throws QueueEmptyException, org.example.chapter13.QueueEmptyException;

}
