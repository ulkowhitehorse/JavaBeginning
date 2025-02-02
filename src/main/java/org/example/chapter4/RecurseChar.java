package org.example.chapter4;

public class RecurseChar {

    public static void RecurseChar(String string) {
        System.out.println("Зашли в RecurseChar, string = " + string);
        if (string.isEmpty()) {
            System.out.println("В isEmpty");
            return;
        } else {
            RecurseChar(string.substring(1));
            System.out.println("substring(1): " + string.substring(1));
            System.out.println(string.charAt(0));
        }
    }

}

class RDemo {
    public static void main(String[] args) {
        String input = "String";
        System.out.print("Строка: " + input + "\n");
        System.out.print("Обратный порядок: ");
        RecurseChar.RecurseChar(input);
    }
}
