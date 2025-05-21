package org.example.chapter13;

public class BoundsDemo {
    public static void main(String[] args) {

        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("Обратная величина iOb - " + iOb.reciprocal());

        System.out.println("Дробная часть iOb(" + iOb.num + ") - " + iOb.fraction());

        System.out.println("Обратная величина iOb - " + iOb.reciprocal());

        System.out.println("Дробная часть iOb - " + iOb.fraction());

        System.out.println();

        NumericFns<Double> dOb = new NumericFns<Double>(5.25);

        System.out.println("Обратная величина dOb(" + dOb.num + ") - " + dOb.reciprocal());

        System.out.println("Дробная часть dOb - " + dOb.fraction());

        NumericFns<Integer> ob1 = new NumericFns<Integer>(6);
        NumericFns<Double> ob2 = new NumericFns<Double>(-6.0);
        NumericFns<Long> ob3 = new NumericFns<Long>(5L);

        System.out.println("Сравнение ob1(" + ob1.num + ") и ob2(" + ob2.num + ")");
        if(ob1.absEqual(ob2))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");

        System.out.println();

        System.out.println("Сравнение ob2(" + ob2.num + ") и ob3(" + ob3.num + ")");
        if(ob2.absEqual(ob3))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");
    }
}

class NumericFns<T extends Number> {
    T num;

    NumericFns(T n) {
        num = n;
    }

    // вернуть обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // вернуть дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;

        return false;
    }
}
