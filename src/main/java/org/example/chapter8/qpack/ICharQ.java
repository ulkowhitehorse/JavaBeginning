package org.example.chapter8.qpack;

import org.example.chapter9.QueueEmptyException;
import org.example.chapter9.QueueFullException;

// Интерфейс для очереди символов
public interface ICharQ {
    // Поместить символ в очередь
    void put(char ch) throws QueueFullException;

    // Извлечь символ из очереди
    char get() throws QueueEmptyException;
}
