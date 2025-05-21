package org.example.chapter12;

public class MyClass {
    private String msg;

    @Deprecated
    public MyClass(String m) {
        msg = m;
    }

    @Deprecated
    public String getMsg() {
        return msg;
    }
}
