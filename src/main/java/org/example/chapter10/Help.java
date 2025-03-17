package org.example.chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Help {
    String helpfile; // Имя файла, содержащего справочную информацию

    Help (String fname) {
        helpfile = fname;
    }

    // Отобразить справочную информацию по указанной теме
    boolean helpon(String what) {
        int ch;
        String topic, info;

        // Открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
        {
            do {
                // Читать символы до тех пор, пока не встретится символ #
                ch = helpRdr.read();

                // Проверить, совпадают ли темы
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) { // найти тему
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        }
        catch (IOException exc) {
            System.out.println("Ошибка при попытке доступа к файлу справки");
            return false;
        }
        return false; // Тема не найдена
    }

    // Получить тему справки.
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        }
        catch (IOException exc) {
            System.out.println("Ошибка при чтении с консоли");
        }
        return topic;
    }
}
