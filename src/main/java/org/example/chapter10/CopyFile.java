package org.example.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
//        FileInputStream fin = null;
//        FileOutputStream fout = null;
        String pathFout = null;

        // Прежде всего необходимо убедиться в том, что программе
        // передаются имена обоих файлов
        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        } else pathFout = args[1];

        // Копирование файла
        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
            // Попытка открытия файлов
//            fin = new FileInputStream(args[0]);
//            fout = new FileOutputStream(args[1]);

            System.out.println("Чтение и запись из файла " + args[0] + " в " + args[1]);
            System.out.print("Данные во входном файле: ");
            do {
                i = fin.read();
                if(i != -1 ) {
                    fout.write(i); // Прочитать байты из одного файла и записать в другой
                    System.out.print((char) i);
                }
            } while (i != -1);
            System.out.println();
            System.out.println("Завершена запись в файл");
        } catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        //чтение из записанного файла
        if (pathFout != null) {
            System.out.println("читаю из записанного файла: " + pathFout);
            try(FileInputStream fin = new FileInputStream(pathFout)) {
 //               fin = new FileInputStream(pathFout);
                do {
                    i = fin.read();
                    if (i != -1) System.out.print((char) i);
                } while (i != -1);
            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода записанного файла: " + exc);
            }
        }
    }
}
