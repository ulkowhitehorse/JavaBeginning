package org.example.chapter8;

public interface MyID {
    // Объявление обычного метода без реализации по умолчанию
    int getUserID();

    // Объявление метода по умолчанию
    default int getAdminID() {
        return 1;
    }

    // Объявление статического метода в интерфейсе
    static int getUniversalID() {
        return 0;
    }
}

class QDEMO_myID {
    public static void main(String[] args) {
        int uID = MyID.getUniversalID();
        System.out.println("uID = " + uID);
    }
}
