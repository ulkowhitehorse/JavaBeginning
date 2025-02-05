package org.example.chapter7;

public class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Конструктор для объекта с одинаковыми значениями
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создать один объект на основе другого
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }



    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double area() {
        System.out.println("Метод area() должен быть переопределен");

        return 0.0;
    }
}

class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");

        style = s;
    }

    Triangle(double x) {
        super(x, "треугольник");

        style = "закрашенный";
    }

    // Создать один объект на основе другого
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println(getName() + style);
    }
}

// Расширение класса Triangle
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() { return color; }

    void showColor() {
        System.out.println("Цвет - " + color);
    }
}

// Подкласс для представления прямоугольников, производный от TwoDShape
class Rectangle extends TwoDShape {
    // Конструктор по умолчанию
    Rectangle() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // Вызвать конструктор суперкласса
    }

    // Создать квадрат
    Rectangle(double x) {
        super(x, "квадрат");
    }

    // Создать один объект на основе другого
    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    // Переопределение метода area() для класса Rectangle
    double area() {
        return getWidth() * getHeight();
    }
}

class Shapes {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10, 20, "фигура");

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Плащадь - " + shapes[i].area());
            System.out.println();
        }

    }
}