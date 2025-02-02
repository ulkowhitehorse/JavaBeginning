package org.example.chapter7;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    // Конструктор класса Vehicle
    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    // Возвратить дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Вычислить объем топлива, требующегося для прохождения заданного пути
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    int getPassengers() { return passengers; }
    int getFuelcap() { return fuelcap; }
    int getMpg() { return fuelcap; }
    void setPassengers(int passengers) { this.passengers = passengers; }
    void setFuelcap(int fuelcap) { this.fuelcap = fuelcap; }
    void setMpg(int mpg) { this.mpg = mpg; }
}

class Truck extends Vehicle {
    private int cargocap; // Грузоподъемность в фунтах

    // Конструктор класса Truck
    Truck(int passengers, int fuelcap, int mpg, int cargocap) {
        super(passengers, fuelcap, mpg);

        this.cargocap = cargocap;
    }

    int getCargocap() { return cargocap; }
    void putCargo(int cargocap) { this.cargocap = cargocap; }
}

class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2,200,7, 44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикап может перевезти " + pickup.getCargocap() + " фунтов");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.\n");
    }
}
