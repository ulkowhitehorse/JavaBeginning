package org.example.chapter13;

public class GenQDemo {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        GenQueue<String> strQ = new GenQueue<String>(strArray);

        try {
            strQ.put("l");
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            System.out.println(strQ.get());
            System.out.println(strQ.get());
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
