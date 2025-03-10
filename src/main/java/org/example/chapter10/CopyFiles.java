package org.example.chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int index = 0;

        if(args.length != 2) {
            System.out.println("Использование: CopyFiles файл1 файл2");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]); FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();
                index++;

                // Значения в виде char
                char ci = (char) i;
                char cj = (char) j;

                // Перевод всех символов нижний регистр
                if (!Character.isLowerCase(ci))
                    ci = (char)(ci+32);
                if (!Character.isLowerCase(cj))
                    cj = (char)(cj+32);

                // Проверка совпадений независимо от регистра
                if ( ci != cj ) {
                    break;
                }
            } while(i != -1 && j != -1);

            if(i != j)
                System.out.println("Содержимое файлов отличается. Различие начинается по индексу " + index);
            else
                System.out.println("Содержимое файлов совпадает");

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
