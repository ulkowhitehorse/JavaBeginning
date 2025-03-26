package org.example.chapter10;

import java.io.*;

public class Exercise7 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Использование программы: Exercise7 file1 file2" +
                    "file1 - файл для копирования, file2 - новый файл с копией file1");
            return;
        }

        String path1 = args[0];
        String path2 = args[1];

        copyByteFile(path1, path2);

    }

    static void copyStringFile(String path1, String path2) {
        int i;

        try(FileReader file1 = new FileReader(path1); FileWriter file2 = new FileWriter(path2)) {
            System.out.println("Выполняю запись файла " + path1 + " в файл " + path2);

            do {
                i =  file1.read();
                if (i != -1) {
                    if ( Character.compare((char)i, ' ') == 0){
                        i = '-';
                    }
                    file2.write(i);
                }
            } while (i != -1);
        }
        catch (IOException exc){
            System.out.println("Ошибка ввода-вывода");
        }
    }

    static void copyByteFile(String path1, String path2) {
        int i;
        FileInputStream file1 = null;
        FileOutputStream file2 = null;

        try {
            file1 = new FileInputStream(path1);
            file2 = new FileOutputStream(path2);

            do {
                i = file1.read();
                if (i != -1) {
                    if (i == 32) {
                        i = 45;
                    }
                    file2.write(i);
                }
            } while (i != -1);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }
        finally {
            try {
                if (file1 != null) file1.close();
            } catch (IOException exc) {
                System.out.println("Ошибка закрытия файла " + path1);
            }

            try {
                if (file2 != null) file2.close();
            } catch (IOException exc) {
                System.out.println("Ошибка закрытия файла "  + path2);
            }
        }
    }
}
