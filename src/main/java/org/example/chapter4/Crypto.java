package org.example.chapter4;

public class Crypto {
    private int key;
    private String keyString;

    public Crypto(int key){
        this.key = key;
        System.out.println("Ключ шифрования key = " + this.key);

    }

    public Crypto(String keyString) {
        // Добавить ключ keyString, если введена строка
        if(keyString.length() == 8) {
            this.keyString = keyString;
            System.out.println("Ключ шифрования keyString = " + this.keyString);
            for(int i=0; i < keyString.length(); i++) {
                key += keyString.charAt(i);
            }
            key /= keyString.length();
            System.out.println("Ключ шифрования равен: " + key);
        } else {
            this.keyString = "0";
            key = 88;
            System.out.println("Данная строка некорректна. Введенная строка должна состоять из 8ми символов. ");
            System.out.println("Ключ шифрования key задан по умолчанию: " + key);
        }
    }

    public String encode(String msg) {
        String encmsg = "";

        for (int i = 0; i < msg.length(); i++) {
            // Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }

        return encmsg;
    }

    public String decode(String encmsg) {
        String decmsg = "";
        // Дешифровать сообщение
        for(int i = 0; i < encmsg.length(); i++){
           // Построение дешифрованной строки сообщения
           decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }

        return decmsg;
    }

    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        Crypto crypto = new Crypto("Password");

        // Зашифровать сообщение
        encmsg = crypto.encode(msg);
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // Дешифровать сообщение
        decmsg = crypto.decode(encmsg);
        System.out.print("Дешифрованное сообещние: ");
        System.out.println(decmsg);
    }
}
