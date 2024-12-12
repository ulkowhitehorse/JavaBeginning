package org.example.chapter1;

public class Example2 {
    int var1;
    int var2;


    public void fillVars() {
        var1 = 1024;

        System.out.println("Переменная var1 содержит " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2);
    }

}
