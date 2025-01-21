package org.example.chapter6;

public class ErrorMsg {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int howbad[] = { 3, 3, 2, 4 };

    Err getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howbad[i]);
        } else
            return new Err("Несуществующий код ошибки", 0);
    }
}

class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        Err e;

        e = err.getErrorMsg(2);
        System.out.println(e.msg + " уровень: " + e.severity);

        e = err.getErrorMsg(22);
        System.out.println(e.msg + " уровень: " + e.severity);
    }
}

class Err {
    String msg; // Сообщение об ошибке
    int severity; // Уровень серьезности ошибки

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
