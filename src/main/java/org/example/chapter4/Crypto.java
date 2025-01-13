package org.example.chapter4;

public class Crypto {
    private int key;

    public Crypto(int key){
        this.key = key;
    }

    public String encode(String msg) {
        String encmsg = "";

        //Зашифровать сообщение
        for(int i = 0; i < msg.length(); i++){
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

        Crypto crypto = new Crypto(88);

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
