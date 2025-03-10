package org.example.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
 //       FileInputStream fin = null; // Инициализация fin значением null

        // Убедиться, что передано имя файла при запуске программы
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])){
//            fin = new FileInputStream(args[0]); // Открыть файл

            // Читать байты, пока не встретится символ EOF
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1); // достижение конца файла
        }  catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        }

    }
}
