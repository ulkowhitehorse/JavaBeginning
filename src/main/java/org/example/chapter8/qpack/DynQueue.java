package org.example.chapter8.qpack;

public class DynQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индесксы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public DynQueue(int size) {
        q = new char[size+1]; // Выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    @Override
    public void put(char ch) {
        if(putloc==q.length-1) {
            // увеличить размер очереди
            char[] t = new char[q.length * 2];

            // Скопировать элементы в новую очередь
            for(int i=0; i < q.length; i++) {
                t[i] = q[i];

            }
            q = t;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    @Override
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
