package org.example.chapter3;

public class EnumSpacer {
    public void enumSpacer() throws java.io.IOException {
        int enumSpaces = 0;

        System.out.print("Введите символы (для выхода введите точку - . : ");

        for (;;) {
            char ch = (char)System.in.read();
            if (ch == ' ') enumSpaces++;
            if (ch == '.') break;
        }

        System.out.println("\n\nКоличество введенных пробелов " + enumSpaces);
    }
}
