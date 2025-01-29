package org.example.chapter4;

public class RecurseChar {

    public static void RecurseChar(String string) {
        if (string.isEmpty()) {
            return;
        } else {
            RecurseChar(string.substring(1));
            System.out.print(string.charAt(0));
        }
    }

}

class RDemo {
    public static void main(String[] args) {
        String input = "Hello, world!";
        System.out.print("Обратный порядок: ");
        RecurseChar.RecurseChar(input);
    }
}
