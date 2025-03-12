package org.example.chapter10;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for(int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            raf.seek(0);
            d = raf.readDouble();
            System.out.println("Первое значение: " + d);

            raf.seek(8); // для хранения значения double требуется 8 байт
            d = raf.readDouble();
            System.out.println("Второе значение: " + d);

            raf.seek(8*3);
            d = raf.readDouble();
            System.out.println("Четвертое значение: " + d);

            System.out.println();

            // Прочитать значения через одно
            System.out.println("Чтение значений с нечетным порядковым номером");
            for(int i = 0; i < data.length; i+=2) {
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
