package org.example.chapter3;

public class WhileDemo {
    public void whileAlphavitDemo() {
        char ch = 'a';

        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
    }

    public void whileStepenDemo() {
        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0){
                result *= 2;
                e--;
            }

            System.out.println("2 в степени " + i + " равно " + result);
        }
    }
}
