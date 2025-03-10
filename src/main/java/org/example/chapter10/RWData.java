package org.example.chapter10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // Записать ряд значений
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);
        }
        catch(IOException exc) {
            System.out.println("Ошибка при записи");
            return;
        }

        System.out.println();

        // Прочитать записанные значения

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))){
            i = dataIn.readInt();
            System.out.println("Прочитано: " + i);

            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);

            b = dataIn.readBoolean();
            System.out.println("Прочитано: " + b);

        }
        catch (IOException exc) {
            System.out.println("Ошибка при чтении");
        }
    }
}
