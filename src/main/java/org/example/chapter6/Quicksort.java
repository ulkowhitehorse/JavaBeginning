package org.example.chapter6;

public class Quicksort {

    // Организовать вызов фактического метода быстрой сортировки символов
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }

    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;
        i = left; j = right;
        x = items[(left+right)/2];
        System.out.println("В методе qs. i = " + i + ", j = " + j + ", x = " + x );

        do {
            while((items[i] < x) && (i < right)) {i++;
                System.out.println("В цикле do. i = " + i);}
            while((x < items[j]) && (j > left)) {j--;
                System.out.println("В цикле do. j = " + j);}

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
                System.out.println("В операторе if. items[" + i + "] = " + items[i]);
                System.out.println("В операторе if. items[" + j + "] = " + items[j]);
            }
        } while(i <= j);

        if(left < j) {
            System.out.println("Вызывается рекурсия. left = " + left + ", j = " + j);
            qs(items, left, j);
        }
        if(i < right) {
            System.out.println("Вызывается рекурсия. i = " + i + ", right = " + right);
            qs(items, i, right);
        }
    }
}

class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Исходный массив: " );
        for(i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();

        // Отсортировать массив
        Quicksort.qsort(a);

        System.out.print("Отсортированный массив: ");
        for(i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();
    }
}
