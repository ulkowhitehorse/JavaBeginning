package org.example.chapter9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class ExceptionThrowingInputStream extends InputStream {

    @Override
    public int read() throws IOException {
        throw new IOException("Simulated IOException");
    }
}

public class ThrowsDemo  {

    public static char prompt(String str) throws java.io.IOException {

        System.out.print(str + ": ");

        return (char) System.in.read();
    }


    public static void main(String[] args) {
        char ch;

        // Закрываем стандартный ввод
        System.setIn(new ExceptionThrowingInputStream());
        try {
            ch = prompt("Enter a letter");

        }
        catch(java.io.IOException exc) {
            System.out.println("Произошло исключение ввода-вывода. " + exc.getMessage());
        }

    }
}
