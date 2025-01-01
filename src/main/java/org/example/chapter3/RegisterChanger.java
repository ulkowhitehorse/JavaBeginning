package org.example.chapter3;

public class RegisterChanger {
    public void changeRegistr() throws java.io.IOException {
        char ch;
        int num = 0;

        System.out.println("Введите символы: ");
        for(;;) {

            ch = (char)System.in.read();

            if (ch == '.') break;

            // Если символы прописные, преобразовать в строчные
            if (ch >= 65 & ch <= 90) {
                ch += 32;
                num++;
            } else if (ch >= 97 & ch <= 122) { // Если символы строчные, преобразовать в прописные
                ch -= 32;
                num++;
            }
            System.out.print("" + ch);
        }
        System.out.println("Количество измененных регистров символов " + num);
    }
}
