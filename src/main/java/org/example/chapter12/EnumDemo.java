package org.example.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        // Отобразить перечислимое значение
        System.out.println("Значение tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Сравнить два перечислимых значения
        if (tp == Transport.TRAIN) {
            System.out.println("tp содержит TRAIN\n");
        }

        // Использовать перечисление для управления оператором switch
        switch(tp) {
            case CAR:
                System.out.println("Автомобиль перевозит людей");
                break;
            case TRUCK:
                System.out.println("Грузовик перевозит груз");
            case AIRPLANE:
                System.out.println("Самолет летит");
                break;
            case TRAIN:
                System.out.println("Поезд движется по рельсам");
                break;
            case BOAT:
                System.out.println("Лодка плывет по воде");
                break;
        }
    }
}

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}



