package org.example.chapter3;

public class Guess  {
    public void guess() throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.print("Попытайтесь угадать: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
                // Отбросить все остальные символы во входном буфере
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print("...Извините, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");

            }
        } while (answer != ch);
    }
}
