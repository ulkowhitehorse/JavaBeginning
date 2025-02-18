package org.example.chapter8.qpack;

// Интерфейс для очереди символов
public interface ICharQ {
    // Поместить символ в очередь
    void put(char ch);

    // Извлечь символ из очереди
    char get();
}
