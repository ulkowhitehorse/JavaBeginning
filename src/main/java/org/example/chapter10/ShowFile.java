package org.example.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // Убедиться, что передано имя файла при запуске программы
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]); // Открыть файл
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
            return;
        }

        try {
            // Читать байты, пока не встретится символ EOF
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1); // достижение конца файла
        } catch(IOException exc) {
            System.out.println("Ошибка при чтении файла");
        }

        try {
            fin.close();
        } catch(IOException exc) {
            System.out.println("Ошибка при закрытии файла");
        }
    }
}
