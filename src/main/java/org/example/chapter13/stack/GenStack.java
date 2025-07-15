package org.example.chapter13.stack;

public class GenStack<T> implements IGenStack<T> {
    private T[] stck; // массив для хранения элементов стека
    private int tos; // вершина стека

    // Создать пустой стек заданного размера
    GenStack(T[] stckArray) {
        stck = stckArray;
        tos = 0;
    }

    // Создать один стек из другого стека
    GenStack(T[] stckArray, GenStack<T> ob) {
        tos = ob.tos;
        stck = stckArray;

        try {
            if(stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }

        // Скопировать элементы
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Создать стек с начальным значениями
    GenStack(T[] stckArray, T[] a) {
        stck = stckArray;

        for(int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            }
            catch(StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    // Поместить объекты в стек
    @Override
    public void push(T obj) throws StackFullException {
        if (tos == stck.length)
            throw new StackFullException(stck.length);

        stck[tos] = obj;
        tos++;
    }

    // Извлечь объекты из стека
    @Override
    public T pop() throws StackEmptyException {
        if (tos == 0)
            throw new StackEmptyException();

        tos--;
        return stck[tos];
    }
}
