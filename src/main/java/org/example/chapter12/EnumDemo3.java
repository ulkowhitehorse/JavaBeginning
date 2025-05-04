package org.example.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport2 tp;

        // Отобразить скорость самолета
        System.out.println("Типичная скорость самолета: " + Transport2.AIRPLANE.getSpeed() + " миль в час\n");

        // Отобразить все виды транспорта и скорости их движения
        System.out.println("Типичные скорости транспортных средств");

        for (Transport2 t : Transport2.values()) {
            System.out.println(t + ": " + t.getSpeed() + " миль в час");
        }
    }
}

enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed; // типичная скорость тс

    // конструктор
    Transport2(int s) {
        speed = s;
    }

    // метод
    int getSpeed() {
        return speed;
    }
}
